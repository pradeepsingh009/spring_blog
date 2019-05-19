package com.learn.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.blog.dao.ArticleAuthorDao;
import com.learn.blog.entity.ArticleAuthor;

@Service
public class ArticleAuthorService {

	@Autowired
	private ArticleAuthorDao articleAuthordao;
	
	@Transactional
	public ArticleAuthor saveAuthor(ArticleAuthor author) {
		articleAuthordao.saveAuthor(author);
		
		return author;
	}
	
	@Transactional
	public List<ArticleAuthor> getAuthors(){
		return articleAuthordao.getAuthors();
	}
	
}
