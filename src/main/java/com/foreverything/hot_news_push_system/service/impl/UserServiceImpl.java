package com.foreverything.hot_news_push_system.service.impl;

import com.foreverything.hot_news_push_system.entity.User;
import com.foreverything.hot_news_push_system.mapper.UserMapper;
import com.foreverything.hot_news_push_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Author 刘光辉
 * @Date 15:53  2021/4/2
 * @Description
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public String getPas(String email) {
		return userMapper.getPassword(email);
	}

	@Override
	public int insertUser(String email, String password,String name) {
		User user=new User(email,password,name);
		return userMapper.insertUser(user);
	}

	@Override
	public String getUserNameByEmail(String email) {
		return userMapper.getUserNameFromEmail(email);
	}
}

