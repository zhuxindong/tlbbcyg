# 说明

## 1.数据库信息

```sql
create database tlbb;
-- ----------------------------
-- Table structure for tlbbuser
-- ----------------------------
DROP TABLE IF EXISTS `tlbbuser`;
CREATE TABLE `tlbbuser`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sex` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '性别',
  `price` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '价格',
  `sellurl` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '链接',
  `life` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '血量',
  `chuanci` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '穿刺',
  `huogong` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '火攻',
  `bingong` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '冰攻',
  `dugong` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '毒攻',
  `xuangong` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '玄攻',
  `huixin` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '会心',
  `mingzhong` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '命中',
  `xiulianscore` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修炼评分',
  `mengpai` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '门派',
  `baoshiscore` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '宝石评分',
  `hongli` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '红利',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 188 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;


```



## 2.用法

启动工程，本地访问

http://localhost:8080/u?price=1500&totalPage=5

price是价格，totalPage是指定爬取前几页的数据，比如totalPage=5，就代表爬取价格1到1500，前5页的数据，



```
UserController里面
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=8&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

profession=8是职业信息，8是逍遥
剩余职业可以去畅易阁看，数字排序的，类推即可
职业信息枚举
0-少林
1-明教
2-丐帮
3-武当
4-峨眉
5-星宿
6-天龙
7-天山
8-逍遥
10-慕容
11-唐门
12-鬼谷
13-桃花岛
```



## 3.查询

比如说查询血量大于60W，火攻大于9000，会心大于1000的角色数据：（按血量排序）

```sql
select * from tlbb.tlbbuser where cast(huogong as SIGNED) > 10000 and cast(life as SIGNED) > 700000 and cast(huixin as SIGNED) > 1200 order by cast(life as SIGNED) desc;
```



再比如说，查询冰攻大于3000，血量大于30W，会心大于100的角色数据：（按血量排序）

```sql
select * from tlbb.tlbbuser where mengpai = '桃花' and cast(bingong as SIGNED) > 3000 and cast(life as SIGNED) > 300000 and cast(huixin as SIGNED) > 100 order by cast(life as SIGNED) desc;
```



再比如说，查询结果按红利数量排序

```sql
select * from tlbb.tlbbuser where mengpai = '桃花'  order by cast(hongli as SIGNED) desc limit 20;
```



