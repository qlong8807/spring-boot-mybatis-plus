package com.xa.jans.utils;

import com.xa.jans.enums.ResultEnum;
import com.xa.jans.vo.Result;

public class ResultUtil {

	public static Result success(Object obj) {
		Result result = new Result();
		result.setCode(0);
		result.setMsg("");
		result.setObj(obj);
		return result;
	}
	
	public static Result fail(Integer code,String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		result.setObj(null);
		return result;
	}
	public static Result fail(ResultEnum en) {
		Result result = new Result();
		result.setCode(en.getCode());
		result.setMsg(en.getMsg());
		result.setObj(null);
		return result;
	}
}
