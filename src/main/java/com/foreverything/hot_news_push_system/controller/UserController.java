package com.foreverything.hot_news_push_system.controller;

import com.foreverything.hot_news_push_system.entity.State;
import com.foreverything.hot_news_push_system.entity.User;
import com.foreverything.hot_news_push_system.service.UserService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName UserController
 * @Author 刘光辉
 * @Date 16:24  2021/4/2
 * @Description
 */
@RestController
@ResponseBody
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/login",produces = "application/json;charset=UTF-8")
	public State Login(@RequestParam("email") String email,@RequestParam("password") String password){
		if (password.equals(userService.getPas(email))){
			return new State(200,"密码匹配，登录成功");
		}else if(null==userService.getPas(email)){
			return new State(401,"该用户不存在，请检查用户名或注册");
		}else{
			return new State(402,"密码错误，请重新输入");
		}
	}

	@PostMapping("/register")
	public State Register(@RequestParam("email")String email,@RequestParam("password")String password,@RequestParam("name")String name){
		return userService.insertUser(email, password,name)==1?new State(200,"注册成功"):new State(403,"注册失败！");
	}

	@GetMapping("/userName")
	public State getUserName(@RequestParam("email")String email){
		String name=userService.getUserNameByEmail(email);
		return name==null?new State(404,"无"):new State(200,name);
	}
}

