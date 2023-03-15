package com.foreverything.hot_news_push_system.mapper;

import com.foreverything.hot_news_push_system.entity.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FavoritesMapper
 * @Author 刘光辉
 * @Date 18:35  2021/4/26
 * @Description
 */

@Mapper
@Component
public interface FavoritesMapper {

	@Insert("insert into favorites(user_email,news_id) values(#{email},#{id})")
	int addFav(@Param("email")String email,@Param("id")int id);

	@Delete("delete from favorites where user_email=#{email} and news_id=#{id}")
	int delFav(@Param("email")String email,@Param("id")int id);

	@Select("select news_id,news_title,news_content,news_date,news_source from news where news_id=any(select news_id from favorites where user_email=#{email})")
	@Results({
			@Result(property = "id",column = "news_id"),
			@Result(property = "title",column = "news_title"),
			@Result(property = "content",column = "news_content"),
			@Result(property = "date",column = "news_date"),
			@Result(property = "source",column = "news_source"),
	})
	List<News> getFavNewsByEmail(@Param("email")String email);

	@Select("select count(*) from favorites where user_email=#{email} and news_id=#{id}")
	int isFavExist(@Param("email")String email,@Param("id")int id);
}
