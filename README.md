Simple CRUD app using:
- Spring Boot
- Spring MVC 
- Spring Data JPA 
- Thymeleaf


create database 

CREATE TABLE `contact` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `name` varchar(50) NOT NULL,
 `email` varchar(50) NULL,
 `phone` varchar(20) NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
