package com.foreverything.hot_news_push_system.entity;

import java.io.Serializable;

/**
 * @ClassName News
 * @Author 刘光辉
 * @Date 10:10  2021/4/17
 * @Description
 */

public class News implements Serializable ,Comparable<News>{

	private int id;
	private String title;
	private String source;
	private String content;
	private String date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "News{" +
				"title='" + title + '\'' +
				", source='" + source + '\'' +
				", content='" + content + '\'' +
				", date='" + date + '\'' +
				'}';
	}

	@Override
	public int compareTo(News obj) {
		return obj.date.compareTo(this.date);
	}
}

