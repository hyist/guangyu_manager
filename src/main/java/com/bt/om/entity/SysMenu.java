package com.bt.om.entity;

import java.util.Date;

public class SysMenu extends ID{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.platform
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Integer platform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.parent_id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.icon
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.text
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String text;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.url
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.tip
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String tip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.verify
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String verify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.display
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String display;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.seq
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Integer seq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.create_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.update_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.id
     *
     * @return the value of sys_menu.id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.id
     *
     * @param id the value for sys_menu.id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.platform
     *
     * @return the value of sys_menu.platform
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.platform
     *
     * @param platform the value for sys_menu.platform
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.parent_id
     *
     * @return the value of sys_menu.parent_id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.parent_id
     *
     * @param parentId the value for sys_menu.parent_id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.icon
     *
     * @return the value of sys_menu.icon
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.icon
     *
     * @param icon the value for sys_menu.icon
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.text
     *
     * @return the value of sys_menu.text
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.text
     *
     * @param text the value for sys_menu.text
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.url
     *
     * @return the value of sys_menu.url
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.url
     *
     * @param url the value for sys_menu.url
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.tip
     *
     * @return the value of sys_menu.tip
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getTip() {
        return tip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.tip
     *
     * @param tip the value for sys_menu.tip
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.verify
     *
     * @return the value of sys_menu.verify
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getVerify() {
        return verify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.verify
     *
     * @param verify the value for sys_menu.verify
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setVerify(String verify) {
        this.verify = verify == null ? null : verify.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.display
     *
     * @return the value of sys_menu.display
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getDisplay() {
        return display;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.display
     *
     * @param display the value for sys_menu.display
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.seq
     *
     * @return the value of sys_menu.seq
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.seq
     *
     * @param seq the value for sys_menu.seq
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.create_time
     *
     * @return the value of sys_menu.create_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.create_time
     *
     * @param createTime the value for sys_menu.create_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.update_time
     *
     * @return the value of sys_menu.update_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.update_time
     *
     * @param updateTime the value for sys_menu.update_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}