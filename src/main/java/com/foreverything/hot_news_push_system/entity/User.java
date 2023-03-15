package com.foreverything.hot_news_push_system.entity;

/**
 * @ClassName User
 * @Author 刘光辉
 * @Date 15:25  2021/4/2
 * @Description
 */

public class User {
	private String name="新用户";
	private String password;
	private String email;

	public User(){
	}

	public User(String email,String password,String name){
		this.email=email;
		this.password=password;
		this.name=name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

