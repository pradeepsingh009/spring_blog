package com.learn.blog.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.blog.entity.ArticleCategory;
import com.learn.blog.rest.exception.BlogEntityNotFoundException;
import com.learn.blog.service.ArticleCategoryService;

@RestController
@RequestMapping("/api")
public class ArticleCategoryController {

	@Autowired
	private ArticleCategoryService articleCategoryService;

	@GetMapping("/article_categories")
	public List<ArticleCategory> getArticleCategories() {
		return articleCategoryService.getArticleCategories();
	}

	@GetMapping("/article_categories/{categoryId}")
	public ArticleCategory getArticleCategory(@PathVariable int categoryId) {
		ArticleCategory category = articleCategoryService.getArticleCategory(categoryId);

		if (category == null) {
			throw new BlogEntityNotFoundException("category with id " + categoryId + " not found");
		}

		return category;
	}

}
