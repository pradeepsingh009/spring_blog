package com.learn.blog.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.blog.entity.Article;

@Repository
public class ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Article> getArticles(){
		Session currentSession = this.sessionFactory.getCurrentSession();
		
		Query<Article> query = currentSession.createQuery("from Article order by title", Article.class);
		
		List<Article> articles = query.getResultList();
		
		return articles;
		
	}
	
	public Article saveArticle(Article article) {
		Session currentSession = this.sessionFactory.getCurrentSession();		
		currentSession.saveOrUpdate(article);
		return article;
	}
}
