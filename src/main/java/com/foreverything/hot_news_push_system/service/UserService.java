package com.foreverything.hot_news_push_system.service;

/**
 * @ClassName UserService
 * @Author 刘光辉
 * @Date 15:52  2021/4/2
 * @Description
 */
public interface UserService {

	String getPas(String email);

	int insertUser(String email,String password,String name);

	String getUserNameByEmail(String email);
}
