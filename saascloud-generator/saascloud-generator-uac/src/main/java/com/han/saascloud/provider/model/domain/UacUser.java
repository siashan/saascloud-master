package com.han.saascloud.provider.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class UacUser {
    /**
     * 主键 自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 真实姓名
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 加密盐
     */
    @Column(name = "SALT")
    private String salt;

    /**
     * 性别
     */
    @Column(name = "GENDER")
    private String gender;

    /**
     * 登录密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 联系电话
     */
    @Column(name = "PHONE_NO")
    private String phoneNo;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 最近登录时间
     */
    @Column(name = "LAST_LOGIN_DATE")
    private Date lastLoginDate;

    /**
     * openID
     */
    @Column(name = "OPEN_ID")
    private String openId;

    /**
     * 微信关注状态
     */
    @Column(name = "WECHAT_ATTENTION_STATUS")
    private String wechatAttentionStatus;

    /**
     * 所属部门id
     */
    @Column(name = "DEPT_ID")
    private Integer deptId;

    @Column(name = "EXT1")
    private String ext1;

    @Column(name = "EXT2")
    private String ext2;

    @Column(name = "EXT3")
    private String ext3;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 用户名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 用户类型
     */
    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 资质id
     */
    @Column(name = "CER_ID")
    private Integer cerId;

    /**
     * 首次登陆是否修改过密码 0 没有 1 已修改
     */
    @Column(name = "IS_PASSWORD_CHANGED")
    private String isPasswordChanged;

    /**
     * 获取主键 自增
     *
     * @return ID - 主键 自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键 自增
     *
     * @param id 主键 自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取真实姓名
     *
     * @return REAL_NAME - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取加密盐
     *
     * @return SALT - 加密盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置加密盐
     *
     * @param salt 加密盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取性别
     *
     * @return GENDER - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取登录密码
     *
     * @return PASSWORD - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取联系电话
     *
     * @return PHONE_NO - 联系电话
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNo 联系电话
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_TIME - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最近登录时间
     *
     * @return LAST_LOGIN_DATE - 最近登录时间
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置最近登录时间
     *
     * @param lastLoginDate 最近登录时间
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 获取openID
     *
     * @return OPEN_ID - openID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置openID
     *
     * @param openId openID
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取微信关注状态
     *
     * @return WECHAT_ATTENTION_STATUS - 微信关注状态
     */
    public String getWechatAttentionStatus() {
        return wechatAttentionStatus;
    }

    /**
     * 设置微信关注状态
     *
     * @param wechatAttentionStatus 微信关注状态
     */
    public void setWechatAttentionStatus(String wechatAttentionStatus) {
        this.wechatAttentionStatus = wechatAttentionStatus;
    }

    /**
     * 获取所属部门id
     *
     * @return DEPT_ID - 所属部门id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置所属部门id
     *
     * @param deptId 所属部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * @return EXT1
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * @param ext1
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    /**
     * @return EXT2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * @param ext2
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    /**
     * @return EXT3
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * @param ext3
     */
    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取用户名
     *
     * @return NAME - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户类型
     *
     * @return USER_TYPE - 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型
     *
     * @param userType 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取资质id
     *
     * @return CER_ID - 资质id
     */
    public Integer getCerId() {
        return cerId;
    }

    /**
     * 设置资质id
     *
     * @param cerId 资质id
     */
    public void setCerId(Integer cerId) {
        this.cerId = cerId;
    }

    /**
     * 获取首次登陆是否修改过密码 0 没有 1 已修改
     *
     * @return IS_PASSWORD_CHANGED - 首次登陆是否修改过密码 0 没有 1 已修改
     */
    public String getIsPasswordChanged() {
        return isPasswordChanged;
    }

    /**
     * 设置首次登陆是否修改过密码 0 没有 1 已修改
     *
     * @param isPasswordChanged 首次登陆是否修改过密码 0 没有 1 已修改
     */
    public void setIsPasswordChanged(String isPasswordChanged) {
        this.isPasswordChanged = isPasswordChanged;
    }
}