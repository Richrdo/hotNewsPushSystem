package com.foreverything.hot_news_push_system.service;

import com.foreverything.hot_news_push_system.entity.News;
import com.foreverything.hot_news_push_system.entity.State;

import java.util.List;

/**
 * @ClassName FavoritesService
 * @Author 刘光辉
 * @Date 18:46  2021/4/26
 * @Description
 */
public interface FavoritesService {

	State addFav(String email, int id);

	State delFav(String email,int id);

	List<News> getFavByEmail(String email);
}
