package com.learn.blog.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.blog.entity.ArticleAuthor;

@Repository
public class ArticleAuthorDao {

	@Autowired
	private SessionFactory sessionFactory; 
	
	public ArticleAuthor saveAuthor(ArticleAuthor author) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(author);
		
		return author;
	}
	
	public List<ArticleAuthor> getAuthors(){
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<ArticleAuthor> query = currentSession.createQuery("from ArticleAuthor order by lname", ArticleAuthor.class);
		
		List<ArticleAuthor> resultList = query.getResultList();
		
		return resultList;
	}
}
