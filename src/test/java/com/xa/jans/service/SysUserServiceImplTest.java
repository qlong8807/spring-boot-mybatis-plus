package com.xa.jans.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baomidou.mybatisplus.plugins.Page;
import com.xa.jans.Application_Privi;
import com.xa.jans.entity.SysUser;
import com.xa.jans.vo.Result;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application_Privi.class)
public class SysUserServiceImplTest {
	
	@Autowired
	private SysUserService sysUserService;

	@Test
	public void test() {
		Result<SysUser> findByName = sysUserService.findByName("zhangsan33");
		System.out.println(findByName);
		System.out.println(sysUserService.selectById(88));
	}
	@Test
	public void testPage() {
		
		Page<SysUser> page = sysUserService.page(new Page<>(0, 10, "name", false), new SysUser());
		System.out.println(page);
	}
}
