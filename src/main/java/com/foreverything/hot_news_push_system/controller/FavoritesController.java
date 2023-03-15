package com.foreverything.hot_news_push_system.controller;

import com.foreverything.hot_news_push_system.entity.News;
import com.foreverything.hot_news_push_system.entity.State;
import com.foreverything.hot_news_push_system.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName FavoritesController
 * @Author 刘光辉
 * @Date 19:47  2021/4/26
 * @Description
 */

@RestController
@RequestMapping("/favorites")
@ResponseBody
public class FavoritesController {

	@Autowired
	FavoritesService favoritesService;

	@RequestMapping("/add")
	public State addFavorites(@RequestParam("email")String email,@RequestParam("id")int id){
		return favoritesService.addFav(email, id);
	}

	@RequestMapping("/del")
	public State delFav(@RequestParam("email")String email,@RequestParam("id")int id){
		return favoritesService.delFav(email, id);
	}

	@RequestMapping("/getFav")
	public List<News> getFavByEmail(@RequestParam("email")String email){
		return favoritesService.getFavByEmail(email);
	}
}

