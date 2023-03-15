package com.foreverything.hot_news_push_system.service.impl;

import com.foreverything.hot_news_push_system.entity.News;
import com.foreverything.hot_news_push_system.mapper.NewsMapper;
import com.foreverything.hot_news_push_system.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NewsServiceImpl
 * @Author 刘光辉
 * @Date 10:14  2021/4/17
 * @Description
 */

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsMapper newsMapper;

	@Override
	public List<News> getNewsByType(String type) {
		List<News> newsList=newsMapper.getNewsByType(type);
		newsList.sort(null);
		return newsList;
	}

	@Override
	public List<News> researchNews(String keywords) {
		List<News> newsList=newsMapper.researchNews(keywords);
		newsList.sort(null);
		return newsList;
	}

	//随机生成N条热点新闻
	@Override
	public List<News> getNNews(int n){
		List<News> newsList=new ArrayList<>();
		News news;
		for(int i=0;i<n;i++){
			int id=(int)(Math.random()*200);
			news=newsMapper.getNewsByID(id);
			newsList.add(news);
		}
		newsList.sort(null);
		return newsList;
	}

}

