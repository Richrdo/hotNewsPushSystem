package com.foreverything.hot_news_push_system.service.impl;

import com.foreverything.hot_news_push_system.entity.News;
import com.foreverything.hot_news_push_system.entity.State;
import com.foreverything.hot_news_push_system.mapper.FavoritesMapper;
import com.foreverything.hot_news_push_system.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName FavoritesImpl
 * @Author 刘光辉
 * @Date 18:54  2021/4/26
 * @Description
 */

@Service
public class FavoritesServiceImpl implements FavoritesService {

	@Autowired
	FavoritesMapper favoritesMapper;

	@Override
	public State addFav(String email, int id) {
		if (favoritesMapper.isFavExist(email, id)==1){
			return new State(200,"该新闻早已收藏！");
		}else{
			return favoritesMapper.addFav(email,id)==1?new State(200,"该新闻已收藏！"):new State(400,"收藏失败！");
		}
	}

	@Override
	public State delFav(String email, int id) {
		return favoritesMapper.delFav(email, id)==1?new State(200,"取消收藏成功"):new State(404,"取消失败！");
	}

	@Override
	public List<News> getFavByEmail(String email) {
		List<News> newsList=favoritesMapper.getFavNewsByEmail(email);
		newsList.sort(null);
		return newsList;
	}
}

