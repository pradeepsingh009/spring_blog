CREATE TABLE `article_author_address` (
	`id` INT AUTO_INCREMENT,
	`country` VARCHAR(100) NOT NULL,
	`city` VARCHAR(100) NOT NULL,
	`town` VARCHAR(100) NOT NULL,
	`house` VARCHAR(100),	
	PRIMARY KEY (id)
);

CREATE TABLE `article_author` (
	`id` INT AUTO_INCREMENT,
	`fname` VARCHAR(100) NOT NULL,
	`lname` VARCHAR(100),
	`address_id` INT,
	PRIMARY KEY (id),
	CONSTRAINT `fk_author_address` FOREIGN KEY (address_id) REFERENCES article_author_address(id)
);

CREATE TABLE `article` (
	`id` INT AUTO_INCREMENT,
	`title` VARCHAR(100) NOT NULL,
	`text` VARCHAR(250),
	`active` BOOLEAN,
	`author_id` INT,
	PRIMARY KEY (id),
	CONSTRAINT `fk_article_author` FOREIGN KEY (author_id) REFERENCES article_author(id)
);

CREATE TABLE `article_comment`(
	`id` INT AUTO_INCREMENT,
	`comment` VARCHAR(200) NOT NULL,
	`article_id` int,
	PRIMARY KEY (id),
	CONSTRAINT `fk_comment_article` FOREIGN KEY (article_id) REFERENCES article(id)
);

CREATE TABLE `article_category` (
	`id` INT AUTO_INCREMENT,
	`name` VARCHAR(100) NOT NULL,
	PRIMARY KEY (id)	
);

CREATE TABLE `article_category_relation` (
	`article_id` INT,
	`category_id` INT,
	PRIMARY KEY (article_id,category_id),
	CONSTRAINT `fk_art_cat_rel_art` FOREIGN KEY (article_id) REFERENCES article(id),
	CONSTRAINT `fk_art_cat_rel_cat` FOREIGN KEY (category_id) REFERENCES article_category(id)
);	


