DROP TABLE IF EXISTS user;
CREATE TABLE user (
	user_id			INTEGER AUTO_INCREMENT,
	user_name		VARCHAR(255) NOT NULL,
	user_password		VARCHAR(255) NOT NULL,
	PRIMARY KEY (user_id)
);

DROP TABLE IF EXISTS page;
CREATE TABLE page (
	page_id			INTEGER AUTO_INCREMENT,
	page_title		VARCHAR(50) NOT NULL,
	page_description	VARCHAR(255),
	page_content		VARCHAR(1000) NOT NULL,
	PRIMARY KEY (page_id)
);
