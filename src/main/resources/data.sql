INSERT INTO link (id,creation_date,last_modified_date,created_by,last_modified_by,title,url) values('1',NOW(),NOW(),null,null,'Getting started with spring boot 2','https://mustafaguler.com/spring-boot');

INSERT INTO comment(id,created_by,creation_date,last_modified_by,last_modified_date,link_id) values(1,null,NOW(),null,NOW(),'what an awesome idea for a course',1);