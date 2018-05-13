package com.xa.jans.enums;

public enum ResultEnum {
	SUCCESS(0,"成功"),
	/** 定义各种错误*/
	FAIL(1,"失败"),
	NAME_REPEAT(450,"用户名重复"),
	NAME_PWD_ERR(451,"用户名/密码不正确"),
	SAVE_ERR(452,"保存失败"),
	UPDATE_ERR(453,"更新失败"),
	DELETE_ERR(454,"删除失败"),
	UNKNOW_ERROR(500,"未知错误"),
	;
	private Integer code;
	private String msg;
	private ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	
}
