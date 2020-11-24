
DROP TABLE IF EXISTS `user`;
CREATE TABLE user(
user_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
school_num varchar(20) NOT NULL UNIQUE,
name varchar(50) NOT NULL,
sex varchar(10),
grade varchar(100),
school varchar(100),
major varchar(100),
class varchar(100),
qq varchar(20),
phone varchar(20),
email varchar(60) NOT NULL UNIQUE,
password varchar(120) NOT NULL DEFAULT '123456',
adress varchar(200),
role int(2) NOT NULL DEFAULT '2' 
)CHARSET=utf8;

INSERT INTO user(`school_num`,`name`,`sex`,`grade`,`school`,`major`,`class`,`qq`,`phone`,`email`,`password`,`adress`,`role`) VALUES 
('111111', 'admin', '', '', '', '', '', '', '', 'admin@qq.com', 'passwd', '', '0'),
('B1234567', 'teacher1', '女', '', '机械工程学院', '', '', '', '', 'teacher1@qq.com', 'passwd', '', '1'),
('B2234567', 'teacher2', '男', '', '材料学院', '', '', '', '', 'teacher2@qq.com', 'passwd', '', '1'),
('41824089', 'wtq', '男', '2018', '计算机与通信工程学院', '计算机科学与技术', '计科182', '1093561227', '13192333399', 'wtqustb@163.com', 'wtq8866', '吉林省', '2'),
('41922111', 'tql', '男', '2019', '自动化学院', '测控', '测控1901', '1427155518', '18753377104', 'tql@qq.com', 'passwd', '山东省青岛市', '2');




DROP TABLE IF EXISTS `notes`;
CREATE TABLE notes(
notes_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
title varchar(50) NOT NULL,
start_time varchar(12) NOT NULL,
stop_time varchar(12) NOT NULL,
description varchar(1000) NOT NULL
)CHARSET=utf8;

INSERT INTO notes(`title`,`start_time`,`stop_time`,`description`) VALUES ('关于全校大一同学的选课通知', '2020-11-23', '2020-11-30', '此次选课将持续一周的时间，共三次机会，请同学们按时限选课，完成应修的学分。注：大一的每学期最多选两门课！');

DROP TABLE IF EXISTS `classroom`;
CREATE TABLE classroom(
classroom_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
capacity  int(5) NOT NULL,
location varchar(10) NOT NULL
)CHARSET=utf8;

INSERT INTO classroom(`capacity`,`location`) VALUES 
('80', '逸夫楼101'),
('160', '教学楼206'),
('80', '机电楼101'),
('160', '逸夫楼806');

DROP TABLE IF EXISTS `cource`;
CREATE TABLE cource(
cource_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
cource_name varchar(20) NOT NULL,
credit varchar(5) NOT NULL,
teacher int(11) NOT NULL,
classroom int(11) NOT NULL,
schooltime varchar(30) NOT NULL,
CONSTRAINT cource_teacher FOREIGN KEY (teacher) REFERENCES user(user_id),
CONSTRAINT cource_classroom FOREIGN KEY (classroom) REFERENCES classroom(classroom_id)
)CHARSET=utf8;

INSERT INTO cource(`cource_name`,`credit`,`teacher`,`classroom`,`schooltime`) VALUES
('计算机网络', '2', '2', '1', '周三9,10节；周五7,8节;[第1-8周]'),
('佛教文化', '1.5', '3', '2', '周三9,10节；周五9,10节；[第5-10周]'),
('西方艺术鉴赏', '1', '2', '3', '周一3,4节；周二5,6节；[第5-12周]'),
('新能源技术', '1.5', '3', '4', '周二7,8节；周六3,4节；[第8-10周]');

DROP TABLE IF EXISTS `score`;
CREATE TABLE score(
score_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
student int(11) NOT NULL, 
cource int(11) NOT NULL, 
pingshi_score varchar(5) NOT NULL,
qimo_score varchar(5) NOT NULL,
final_score varchar(5) NOT NULL,
CONSTRAINT score_student FOREIGN KEY (student) REFERENCES user(user_id),
CONSTRAINT score_cource FOREIGN KEY (cource) REFERENCES cource(cource_id)
)CHARSET=utf8;

INSERT INTO score(`student`,`cource`,`pingshi_score`,`qimo_score`,`final_score`) VALUES
('4', '1', '90', '99', '95'),
('4', '2', '70', '55', '100'),
('5', '3', '60', '90', '100');


