package com.foreverything.hot_news_push_system.entity;

/**
 * @ClassName State
 * @Author 刘光辉
 * @Date 16:35  2021/4/2
 * @Description
 */

public class State {
	private int code;
	private String message;

	public State(){

	}

	public State(int code,String message){
		this.code=code;
		this.message=message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

