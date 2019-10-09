package com.atguigu.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springboot.bean.TAdmin;

//@Mapper
public interface TAdminMapper {

	

	public List<TAdmin> selectAdmins() ;
	
	
	

}
