package com.foreverything.hot_news_push_system.service;

import com.foreverything.hot_news_push_system.entity.News;

import java.util.List;

/**
 * @ClassName NewsService
 * @Author 刘光辉
 * @Date 10:09  2021/4/17
 * @Description
 */
public interface NewsService {

	List<News> getNewsByType(String type);

	List<News> getNNews(int n);

	List<News> researchNews(String keywords);
}
