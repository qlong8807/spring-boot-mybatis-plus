package com.xa.jans.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.xa.jans.entity.SysUser;
import com.xa.jans.vo.Result;

public interface SysUserService extends IService<SysUser>{

	public Page<SysUser> page(Page<SysUser> page,SysUser user);

	public Result<SysUser> findByName(String name);

	public Result<String> save(SysUser sysUser) throws Exception;

	public Result<String> update(SysUser sysUser) throws Exception;

	public Result<String> deleteById(Integer id) throws Exception;

}
