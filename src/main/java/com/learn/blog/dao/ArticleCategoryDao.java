package com.learn.blog.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.blog.entity.ArticleCategory;

@Repository
public class ArticleCategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<ArticleCategory> getArticleCategories() {
	
		Session currentSession  = sessionFactory.getCurrentSession();
		
		Query<ArticleCategory> query = currentSession.createQuery(" from ArticleCategory order by name ",ArticleCategory.class);
		
		List<ArticleCategory> resultset = query.getResultList();
		
		return resultset;
	}
	
	public ArticleCategory getArticleCategory(int catId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		ArticleCategory cat = currentSession.get(ArticleCategory.class, catId);
		
		return cat;
	}

}
