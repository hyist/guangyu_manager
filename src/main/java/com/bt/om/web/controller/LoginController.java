package com.bt.om.web.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bt.om.common.SysConst;
import com.bt.om.common.web.PageConst;
import com.bt.om.entity.SysUser;
import com.bt.om.entity.SysMenu;
import com.bt.om.enums.SessionKey;
import com.bt.om.log.SystemLogThread;
import com.bt.om.security.ShiroUtils;
import com.bt.om.util.RequestUtil;
import com.bt.om.web.BasicController;

/**
 * 用户登录Controller
 */
@Controller
public class LoginController extends BasicController {

	/**
	 * 跳转到登录页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String login(Model model, HttpServletRequest request) {

		/*
		 * String str = request.getServerName(); try { SysLogoControl
		 * logoControl = logoControlService.selectByDomain(str); if (logoControl
		 * != null) { request.getSession().setAttribute("loginLogo",
		 * logoControl.getLoginLogo());
		 * request.getSession().setAttribute("topLogo",
		 * logoControl.getTopLogo()); } } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			return "redirect:/index";
		}
		return PageConst.LOGIN_PAGE;
	}

	/**
	 * 登录处理
	 * 
	 * @param model
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/doLogin", method = { RequestMethod.POST, RequestMethod.GET })
	public String doLogin(Model model, SysUser user, HttpServletRequest request, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin",request.getHeader("origin"));
		response.setHeader("Access-Control-Allow-Credentials","true");
		// 获取页面输入验证码
		String code = RequestUtil.getParameter(request, "code");

		// 账户必须验证
		if (StringUtils.isEmpty(user.getUsername())) {
			model.addAttribute(SysConst.RESULT_KEY, "请输入账号");
			return PageConst.LOGIN_PAGE;
		}

		// 密码必须验证
		if (StringUtils.isEmpty(user.getPassword())) {
			model.addAttribute(SysConst.RESULT_KEY, "请输入密码");
			model.addAttribute("username", user.getUsername());
			return PageConst.LOGIN_PAGE;
		}

		// 验证码必须验证
		if (StringUtils.isEmpty(code)) {
			model.addAttribute(SysConst.RESULT_KEY, "请输入验证码");
			model.addAttribute("username", user.getUsername());
			return PageConst.LOGIN_PAGE;
		}

		String sessionCode = request.getSession().getAttribute(SessionKey.SESSION_CODE.toString()) == null ? ""
				: request.getSession().getAttribute(SessionKey.SESSION_CODE.toString()).toString();

		// 验证码有效验证
		if (!code.equalsIgnoreCase(sessionCode)) {
			model.addAttribute(SysConst.RESULT_KEY, "验证码错误");
			model.addAttribute("username", user.getUsername());
			return PageConst.LOGIN_PAGE;
		}

		Subject subject = SecurityUtils.getSubject();
		String md5Pwd = new Md5Hash(user.getPassword(), user.getUsername()).toString();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), md5Pwd);
		try {
			// 账号密码有效性验证
			subject.login(token);

			// 获取用户信息
			SysUser findUser = getLoginUser();

			// 账户停用的时候
			if (findUser.getStatus()!=null&&findUser.getStatus() == 2) {
				// 清除session中的用户信息
				ShiroUtils.removeAttribute(SessionKey.SESSION_LOGIN_USER.toString());
				model.addAttribute(SysConst.RESULT_KEY, "该账户已被停用，请联系管理员");
				model.addAttribute("username", user.getUsername());
				return PageConst.LOGIN_PAGE;
			}

			// ========记录日志===========
			new Thread(new SystemLogThread("系统首页", "登录", user.getUsername(), getIp(), "", "", 1)).start();
		} catch (AuthenticationException ae) {
			model.addAttribute(SysConst.RESULT_KEY, "用户名或密码错误");
			model.addAttribute("username", user.getUsername());
			return PageConst.LOGIN_PAGE;
		}

		List<SysMenu> menuList = (List<SysMenu>) ShiroUtils
				.getSessionAttribute(SessionKey.SESSION_USER_MENU.toString());
		if (menuList != null && menuList.size() > 0) {
			return "redirect:" + menuList.get(0).getUrl();
		} else {
			return "redirect:/index";
		}
	}

	/**
	 * 退出登录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		SecurityUtils.getSubject().logout();
		return "redirect:/login";
	}

	/**
	 * 没有权限跳转页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/noAuthority", method = RequestMethod.GET)
	public String noAuthority() {
		return PageConst.NO_AUTHORITY;
	}

	/**
	 * 获取验证码
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = {"/getCode","/api/getCode"}, method = RequestMethod.GET)
	public void getCode(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 创建一张空白的图片
		BufferedImage image = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
		// 获取该图片的笔画
		Graphics g = image.getGraphics();

		// 绘制背景
		// 设置画笔的颜色
		Random r = new Random();
		g.setColor(new Color(249, 249, 250));
		// 绘制一个实心额矩形区域
		g.fillRect(0, 0, 100, 30);
		// 绘制内容
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		g.setFont(new Font(null, Font.BOLD, 25));

		// 生成验证码
		String num = getNumber(5);

		// 验证码的内容保存到session中
		HttpSession session = request.getSession();System.out.println(session.getId());
		session.setAttribute(SessionKey.SESSION_CODE.toString(), num);
		g.drawString(num, 5, 25);

		// 将内存中的图片发送到客户端
		response.setContentType("image/jpg");
		OutputStream ops = response.getOutputStream();
		ImageIO.write(image, "jpeg", ops);
	}

	/**
	 * 根据位数生成验证码
	 * 
	 * @param size
	 *            位数
	 * @return
	 */
	public String getNumber(int size) {

		String retNum = "";

		// 定义验证码的范围
//		String codeStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String codeStr = "1234567890";

		Random r = new Random();
		for (int i = 0; i < size; i++) {
			retNum += codeStr.charAt(r.nextInt(codeStr.length()));
		}

		return retNum;
	}
}
