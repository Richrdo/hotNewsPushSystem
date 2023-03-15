package com.foreverything.hot_news_push_system.mapper;

import com.foreverything.hot_news_push_system.entity.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName NewsMapper
 * @Author 刘光辉
 * @Date 10:15  2021/4/17
 * @Description
 */

@Mapper
@Component
public interface NewsMapper {


	@Select("select news_id,news_title,news_content,news_date,news_source from ${type}")
	@Results({
			@Result(property = "id",column = "news_id"),
			@Result(property = "title",column = "news_title"),
			@Result(property = "content",column = "news_content"),
			@Result(property = "date",column = "news_date"),
			@Result(property = "source",column = "news_source"),
	})
	public List<News> getNewsByType(@Param("type") String type);

	/**
	 * @param keywords 为搜索的关键字
	 * @return 返回标题或者内容包含关键字的新闻列表
	 */
	@Select("select news_id,news_title,news_content,news_date,news_source from news where news_title like '%${keywords}%' or news_content like '%${keywords}%'")
	@Results({
			@Result(property = "id",column = "news_id"),
			@Result(property = "title",column = "news_title"),
			@Result(property = "content",column = "news_content"),
			@Result(property = "date",column = "news_date"),
			@Result(property = "source",column = "news_source"),
	})
	public List<News> researchNews(@Param("keywords") String keywords);

	/**
	 *
	 * @param id 新闻ID
	 * @return 根据ID返回该新闻
	 */
	@Select("select news_id,news_title,news_content,news_date,news_source from news where news_id=#{id}")
	@Results({
			@Result(property = "id",column = "news_id"),
			@Result(property = "title",column = "news_title"),
			@Result(property = "content",column = "news_content"),
			@Result(property = "date",column = "news_date"),
			@Result(property = "source",column = "news_source"),
	})
	public News getNewsByID(@Param("id") int id);
}
