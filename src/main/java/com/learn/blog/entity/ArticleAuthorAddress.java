package com.learn.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="article_author_address")
public class ArticleAuthorAddress {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="country")
	private String country;
	
	@Column(name="city")
	private String city;
	
	@Column(name="town")
	private String town;
	
	@Column(name="house")
	private String house;
	
	public ArticleAuthorAddress(String country, String city, String town, String house) {
		this.country = country;
		this.city = city;
		this.town = town;
		this.house = house;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}



	@Override
	public String toString() {
		return "ArticleAuthorAddress [id=" + id + ", country=" + country + ", city=" + city + ", town=" + town
				+ ", house=" + house + "]";
	}
	

}
