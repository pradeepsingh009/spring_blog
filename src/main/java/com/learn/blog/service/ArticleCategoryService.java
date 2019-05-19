package com.learn.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.blog.dao.ArticleCategoryDao;
import com.learn.blog.entity.ArticleCategory;


@Service
public class ArticleCategoryService {
	
	@Autowired
	private ArticleCategoryDao articleCategoryDao;
	
	@Transactional
	public List<ArticleCategory> getArticleCategories(){
		return articleCategoryDao.getArticleCategories();
	}
	
	@Transactional
	public ArticleCategory getArticleCategory(int catId) {
		return articleCategoryDao.getArticleCategory(catId);
	}

}
