package com.foreverything.hot_news_push_system.mapper;

import com.foreverything.hot_news_push_system.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserMapper
 * @Author 刘光辉
 * @Date 15:31  2021/4/2
 * @Description
 */

@Mapper
@Component
public interface UserMapper {

	@Select("select password from user where email=#{email}")
	public String getPassword(@Param("email")String email);

	@Insert("insert ignore into user(email,password,name) values(#{user.email},#{user.password},#{user.name});")
	public int insertUser(@Param("user") User user);

	@Select("select name from user where email=#{email}")
	public String getUserNameFromEmail(@Param("email")String email);

}
