package com.atguigu.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.mapper.TAdminMapper;
import com.atguigu.springboot.service.TAdminService;

@Service
public class TAdminServiceImpl implements TAdminService {
	@Autowired
	TAdminMapper adminMapper;

	@Override
	public List<TAdmin> listAdmins() {
		// TODO Auto-generated method stub
		return adminMapper.selectAdmins();
	}
	public void test1(){}

}
