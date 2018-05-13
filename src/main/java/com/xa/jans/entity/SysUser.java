package com.xa.jans.entity;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.xa.jans.utils.JsonUtil;

/**
 * @author zyl
 * @date 2018年5月11日
 * @desc 用户表
 */
@TableName("SYS_USER")  
public class SysUser implements java.io.Serializable {
	private static final long serialVersionUID = -1L;
	@TableId("ID")
	private Integer id;
	// 昵称、登录名
	@TableField("NAME")
	private String name;
	// 真实姓名
	@TableField("REAL_NAME")
	private String realName;
	// 
	@TableField("PASSWORD")
	private String password;
	// 
	@TableField("AGE")
	private Integer age;
	// 
	@TableField("SEX")
	private Integer sex;
	// 
	@TableField("TEL_PHONE")
	private String telPhone;
	// 
	@TableField("ADDRESS")
	private String address;
	// 
	@TableField("EMAIL")
	private String email;
	// 
	@TableField("BIRTHDAY")
	private Timestamp birthday;
	// 最后登录IP
	@TableField("LAST_LOGIN_IP")
	private String lastLoginIp;
	// 状态，0正常，1被锁不可登录，2不可用
	@TableField("STATUS")
	private Integer status;
	// 创建人ID，如果是注册则为空
	@TableField("CREATE_BY")
	private Integer createBy;
	// 当前用户创建时间
	@TableField("CREATE_TIME")
	private Timestamp createTime;
    
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRealName() {
		return realName;
	}


	public void setRealName(String realName) {
		this.realName = realName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getSex() {
		return sex;
	}


	public void setSex(Integer sex) {
		this.sex = sex;
	}


	public String getTelPhone() {
		return telPhone;
	}


	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Timestamp getBirthday() {
		return birthday;
	}


	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}


	public String getLastLoginIp() {
		return lastLoginIp;
	}


	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Integer getCreateBy() {
		return createBy;
	}


	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}


	public Timestamp getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}


	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
