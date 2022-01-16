package com.liquors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liquors.mapper.UserTableMapper;
import com.liquors.vo.UserTable;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserTableMapper userDao;

	@Override
	public UserTable insertUser(UserTable user) {
		userDao.insertUser(user);
		return userDao.userByNo(user.getNo());
	}

	@Override
	public UserTable UserDetailByNo(int no) {
		UserTable user = userDao.userByNo(no);
		return user;
	}
	
	
	
}
