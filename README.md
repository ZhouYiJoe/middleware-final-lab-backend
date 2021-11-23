本项目所使用的Java版本为8。

要运行本项目，首先要安装版本为8.0以上的MySQL。

安装MySQL后，需要把root密码设为123456。

另外需要建立一个名为middleware_final_lab的数据库，并在该数据库中建立一个表，表的创建语句如下。

```sql
CREATE TABLE `tstudentinfo` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `major` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

另外还需要安装Maven，Maven的安装方法请查百度。

建议使用IntelliJ IDEA打开本项目，可以在官网 https://www.jetbrains.com/shop/eform/students 用学校的学生邮箱申请免费使用IDEA。建议自学一下IDEA的使用方法。

用IDEA打开本项目后，如下图所示，可以看到在webapp目录下有很多jsp文件，这就是本项目的前端部分。



![image-20211123194745221](E:\Documents\code\middleware-final-lab-backend\md_img\image-20211123194745221.png)



在jsp代码里，可以通过"${变量名}"的方式从后端获取数据，这里的变量名是由后端决定的。



![image-20211123195313461](E:\Documents\code\middleware-final-lab-backend\md_img\image-20211123195313461.png)