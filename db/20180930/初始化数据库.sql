
DROP TABLE IF EXISTS `w_user`;

CREATE TABLE `w_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `state` int(10) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `w_user` */

insert  into `w_user`(`id`,`username`,`password`,`state`) values (1,'tom','123456',1);