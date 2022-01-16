package com.liquors.service;

import org.springframework.stereotype.Service;

import com.liquors.mapper.UserTableMapper;
import com.liquors.vo.UserTable;


public interface UserService {

	/**
	 * 입력받은 User의 객체를 저장한다. 
	 * @param user 입력받은 정보
	 * @return 유저의 정보
	 */
	public UserTable insertUser(UserTable user);
	
	/**
	 * 해당하는 유저의 정보를 조회한다. 
	 * @param no 조회하고자하는 번호
	 * @return 유저의 정보
	 */
	public UserTable UserDetailByNo(int no);
	
}
