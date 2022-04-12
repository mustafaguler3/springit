CREATE DATABASE IF NOT EXISTS `springit`;
USE `springit`;

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment`(
    `id` bigint(20) not null auto_increment,
    `created_by` varchar(255) default null,
    `creation_date` datetime default null,
    `last_modified_by` varchar(255) default null,
    `last_modified_date` datetime default null,
    `body` varchar(255) default null,
    `link_id` bigint(20) default null,
    primary key(`id`),
    KEY `FKout` (`link_id`)
)
DROP table IF EXISTS `link`;
CREATE TABLE `link`(
    `id` bigint(20) not null auto_increment,
    `created_by` varchar(255) default null,
    `creation_date` datetime default null,
    `last_modified_by` varchar(255) default null,
    `last_modified_date` datetime default null,
    `title` varchar(255) default null,
    `url` varchar(255) default null,
    primary key(`id`),
    KEY `FKout` (`link_id`)
)




