package com.foreverything.hot_news_push_system.controller;

import com.foreverything.hot_news_push_system.entity.State;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName ExceptionHandlerController
 * @Author 刘光辉
 * @Date 20:44  2021/4/26
 * @Description
 */

@RestController
@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(Exception.class)
	public State defaultExceptionHandler(HttpServletRequest request,Exception e) throws Exception{
		e.printStackTrace();
		return new State(500,"服务器异常！你干了啥?");
	}
}

