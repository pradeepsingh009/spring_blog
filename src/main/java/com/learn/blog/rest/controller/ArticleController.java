package com.learn.blog.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.blog.entity.Article;
import com.learn.blog.service.ArticleService;

@RestController
@RequestMapping("/api")
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles")
	public List<Article> getArticles(){
		return this.articleService.getArticles();
	}
	
	@PostMapping("/articles")
	public Article saveArticle(@RequestBody Article article) {
		article.setId(0);
		System.out.println(article);
		this.articleService.saveArticle(article);
		return article;
	}
	
	@PutMapping("/articles")
	public Article updateArticle(@RequestBody Article article) {
		System.out.println(article);

		this.articleService.saveArticle(article);
		return article;		
	}
}
