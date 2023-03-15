package com.foreverything.hot_news_push_system;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @ClassName ServletInitializer
 * @Author 刘光辉
 * @Date 20:26  2021/4/5
 * @Description
 */

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HotNewsPushSystemApplication.class);
	}
}

