package com.learn.blog.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.blog.entity.ArticleAuthor;
import com.learn.blog.service.ArticleAuthorService;

@RestController
@RequestMapping("/api")
public class ArticleAuthorController {

	@Autowired
	private ArticleAuthorService articleAuthorService;
	
	@GetMapping("/article_authors")
	public List<ArticleAuthor> getAuthors() {
		return this.articleAuthorService.getAuthors();
	}
	
	@PostMapping("/article_authors")
	public ArticleAuthor saveAuthor(@RequestBody ArticleAuthor author) {		
		author.setId(0);		
		this.articleAuthorService.saveAuthor(author);		
		return author;
	}
	
	
}
