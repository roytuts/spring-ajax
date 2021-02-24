CREATE TABLE `company` (
  `id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

insert  into `company`(`id`,`name`) values 
(1,'Tom & Jerry'),
(2,'Order All'),
(3,'Akash Food'),
(4,'Chinese Food'),
(5,'Roy Food');