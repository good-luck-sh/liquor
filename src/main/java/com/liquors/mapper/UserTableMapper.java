package com.liquors.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.UserTable;

@Mapper
public interface UserTableMapper {

	public void insertUser(UserTable user);
	public UserTable userByNo(int no);
	
	
}
