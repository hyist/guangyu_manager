package com.bt.om.vo.api;

import java.io.Serializable;

public class ProductInfoVo implements Serializable {

	private static final long serialVersionUID = 5774873558751018950L;
	private String shortLinkUrl="";
	private String couponName="";
	private String couponLink="";
	private String msg="";

	public ProductInfoVo(String shortLinkUrl,String couponName,String couponLink,String msg) {
		this.shortLinkUrl = shortLinkUrl;
		this.couponName=couponName;
		this.couponLink=couponLink;
		this.msg=msg;
	}

	public String getShortLinkUrl() {
		return shortLinkUrl;
	}

	public void setShortLinkUrl(String shortLinkUrl) {
		this.shortLinkUrl = shortLinkUrl;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponLink() {
		return couponLink;
	}

	public void setCouponLink(String couponLink) {
		this.couponLink = couponLink;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
