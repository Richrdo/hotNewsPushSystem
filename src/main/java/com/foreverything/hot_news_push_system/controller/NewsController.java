package com.foreverything.hot_news_push_system.controller;

import com.foreverything.hot_news_push_system.entity.News;
import com.foreverything.hot_news_push_system.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName NewsController
 * @Author 刘光辉
 * @Date 10:29  2021/4/17
 * @Description
 */

@RestController
@ResponseBody
@RequestMapping("/news")
public class NewsController {

	@Autowired
	NewsService newsService;

	@RequestMapping("/international")
	public List<News> getInternationalNews(){
		return newsService.getNewsByType("news_international");
	}

	@RequestMapping("/domestic")
	public List<News> getDomesticNews(){
		return newsService.getNewsByType("news_domestic");
	}

	@RequestMapping("/social")
	public List<News> getSocialNews(){
		return newsService.getNewsByType("news_social");
	}

	@RequestMapping("/research")
	public List<News> researchNews(@RequestParam("keywords")String keywords){
		return newsService.researchNews(keywords);
	}

	@RequestMapping("/getNHotNews")
	public List<News> getNNews(@RequestParam("number")int n){
		return newsService.getNNews(n);
	}
}

