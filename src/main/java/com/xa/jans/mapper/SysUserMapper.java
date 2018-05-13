package com.xa.jans.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xa.jans.entity.SysUser;

@Repository
public interface SysUserMapper extends BaseMapper<SysUser>{

	@Select("select * from SYS_USER where name=#{name}")
	public SysUser findUserbyName(String name);
}
