package com.zxd.tlbbcyg.utils;

import com.alibaba.fastjson.JSON;
import com.zxd.tlbbcyg.pojo.TlbbUser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlUtils {

    public static void main(String[] args) throws IOException {
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=8&price=1-400&have_chosen=price*1-400%20profession*8&page_num=1";
        Document document = Jsoup.parse(new URL(url), 10000);

        Element J_good_list = document.getElementById("J_good_list");

        Elements lis = J_good_list.getElementsByTag("li");

//        for (Element li : lis) {
//            Element iteminfo = li.getElementsByClass("item-info").get(0);
//            String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
//            System.out.println(detailUrl);
//        }

        qryDetail("http://tl.cyg.changyou.com/goods/char_detail?serial_num=202101091418368201");
    }



    public static void qryDetail(String url) throws IOException {
        Document document = Jsoup.parse(new URL(url), 10000);

        // 基本信息 灵气体力啥的
        Element baseInfos = document.getElementsByClass("right w222 fn-clearfix").get(0).getElementsByClass("box2 h422").get(0);

        //  价格信息
        Element goodsInfos = document.getElementsByClass("goods-info").get(0).getElementsByClass("info-list").get(0);

        // 其他信息 宝石评分啥的
        Element otherInfos = document.getElementsByClass("left score-wrap w323").get(0).getElementsByClass("box2 fn-fix-info").get(0);

        // 装备信息，冰火玄毒穿刺伤害等信息
        Element userInfos = document.getElementsByClass("left w323").get(0).getElementsByClass("role-show").get(0);

        TlbbUser user = new TlbbUser();
        user.setSellUrl(url);
        user.setPrice(goodsInfos.getElementsByClass("ui-money-color").get(0).html().replace("￥",""));
        user.setLife(baseInfos.getElementsByTag("i").get(0).html());
        user.setSex(baseInfos.getElementsByClass("row2").get(1).getElementsByTag("span").html());
        user.setMingZhong(baseInfos.getElementsByClass("row2").get(14).getElementsByTag("span").html());
        user.setHuiXin(baseInfos.getElementsByClass("row2").get(16).getElementsByTag("span").html());
        user.setXiuLianScore(otherInfos.getElementsByClass("row2").get(3).getElementsByTag("span").html());
        user.setBinGong(userInfos.getElementsByAttributeValue("data-tip","bing").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("冰攻击 +",""));
        user.setHuoGong(userInfos.getElementsByAttributeValue("data-tip","huo").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("火攻击 +",""));
        user.setXuanGong(userInfos.getElementsByAttributeValue("data-tip","xuan").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("玄攻击 +",""));
        user.setDuGong(userInfos.getElementsByAttributeValue("data-tip","du").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("毒攻击 +",""));
        user.setChuanCi(userInfos.getElementsByAttributeValue("data-tip","sword").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("穿刺伤害 ：",""));

        System.out.println(JSON.toJSON(user));
    }

}
