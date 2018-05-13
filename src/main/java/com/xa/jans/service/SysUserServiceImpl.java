package com.xa.jans.service;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xa.jans.entity.SysUser;
import com.xa.jans.enums.ResultEnum;
import com.xa.jans.mapper.SysUserMapper;
import com.xa.jans.utils.ResultUtil;
import com.xa.jans.vo.Result;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{

	public Page<SysUser> page(Page<SysUser> page,SysUser user) {
		Wrapper<SysUser> w = new EntityWrapper<SysUser>();
		Page<SysUser> selectPage = super.selectPage(page, w);
		return selectPage;
	}
	
	@Override
	public Result<SysUser> findByName(String name) {
		SysUser findUserbyName = baseMapper.findUserbyName(name);
		return ResultUtil.success(findUserbyName);
	}

	@Override
	public Result<String> save(SysUser sysUser) throws Exception {
		boolean insert = super.insert(sysUser);
		if(insert) {
			return ResultUtil.success(insert);
		}
		return ResultUtil.fail(ResultEnum.SAVE_ERR);
	}

	@Override
	public Result<String> update(SysUser sysUser) throws Exception {
		boolean updateById = super.updateById(sysUser);
		if(updateById) {
			return ResultUtil.success(updateById);
		}
		return ResultUtil.fail(ResultEnum.UPDATE_ERR);
	}

	@Override
	public Result<String> deleteById(Integer id) throws Exception {
		boolean deleteById = super.deleteById(id);
		if(deleteById) {
			return ResultUtil.success(deleteById);
		}
		return ResultUtil.fail(ResultEnum.DELETE_ERR);
	}

}
