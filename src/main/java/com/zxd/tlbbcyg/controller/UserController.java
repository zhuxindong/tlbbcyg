package com.zxd.tlbbcyg.controller;

import com.alibaba.fastjson.JSON;
import com.zxd.tlbbcyg.mapper.TlbbUserMapper;
import com.zxd.tlbbcyg.pojo.TlbbUser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class UserController {

    @Autowired
    TlbbUserMapper tlbbUserMapper;

    @RequestMapping("/t1")
    public String test(){
        List<TlbbUser> list = tlbbUserMapper.selectList(null);
        return JSON.toJSONString(list);
    }


    @RequestMapping("/xy")
    public String update(@RequestParam(value = "price") String price, @RequestParam(value = "totalPage") String totalPage){
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=8&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

        for (int i = 1; i <= Integer.valueOf(totalPage); i++) {
            try {
                String realUrl = url + String.valueOf(i);
                Document document = Jsoup.parse(new URL(realUrl), 10000);
                Element J_good_list = document.getElementById("J_good_list");
                Elements lis = J_good_list.getElementsByTag("li");

                for (Element li : lis) {
                    try {
                        Element iteminfo = li.getElementsByClass("item-info").get(0);
                        String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
                        System.out.println(detailUrl);
                        TlbbUser tlbbUser = qryDetail(detailUrl,"逍遥");
                        tlbbUserMapper.insert(tlbbUser);
                        Thread.sleep(500);
                    }catch (Exception e1){
                        e1.printStackTrace();
                        continue;
                    }
                }

                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

        return "success!";

    }



    @RequestMapping("/tm")
    public String updatetangm(@RequestParam(value = "price") String price, @RequestParam(value = "totalPage") String totalPage){
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=11&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

        for (int i = 1; i <= Integer.valueOf(totalPage); i++) {
            try {
                String realUrl = url + String.valueOf(i);
                Document document = Jsoup.parse(new URL(realUrl), 10000);
                Element J_good_list = document.getElementById("J_good_list");
                Elements lis = J_good_list.getElementsByTag("li");

                for (Element li : lis) {
                    try {
                        Element iteminfo = li.getElementsByClass("item-info").get(0);
                        String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
                        System.out.println(detailUrl);
                        TlbbUser tlbbUser = qryDetail(detailUrl,"唐门");
                        tlbbUserMapper.insert(tlbbUser);
                        Thread.sleep(500);
                    }catch (Exception e1){
                        e1.printStackTrace();
                        continue;
                    }
                }

                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

        return "success!";

    }




    @RequestMapping("/th")
    public String updatetaohua(@RequestParam(value = "price") String price, @RequestParam(value = "totalPage") String totalPage){
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=13&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

        for (int i = 1; i <= Integer.valueOf(totalPage); i++) {
            try {
                String realUrl = url + String.valueOf(i);
                Document document = Jsoup.parse(new URL(realUrl), 10000);
                Element J_good_list = document.getElementById("J_good_list");
                Elements lis = J_good_list.getElementsByTag("li");

                for (Element li : lis) {
                    try {
                        Element iteminfo = li.getElementsByClass("item-info").get(0);
                        String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
                        System.out.println(detailUrl);
                        TlbbUser tlbbUser = qryDetail(detailUrl,"桃花");
                        tlbbUserMapper.insert(tlbbUser);
                        Thread.sleep(500);
                    }catch (Exception e1){
                        e1.printStackTrace();
                        continue;
                    }
                }

                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

        return "success!";

    }

    @RequestMapping("/em")
    public String updateemei(@RequestParam(value = "price") String price, @RequestParam(value = "totalPage") String totalPage){
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=13&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

        for (int i = 1; i <= Integer.valueOf(totalPage); i++) {
            try {
                String realUrl = url + String.valueOf(i);
                Document document = Jsoup.parse(new URL(realUrl), 10000);
                Element J_good_list = document.getElementById("J_good_list");
                Elements lis = J_good_list.getElementsByTag("li");

                for (Element li : lis) {
                    try {
                        Element iteminfo = li.getElementsByClass("item-info").get(0);
                        String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
                        System.out.println(detailUrl);
                        TlbbUser tlbbUser = qryDetail(detailUrl,"峨眉");
                        tlbbUserMapper.insert(tlbbUser);
                        Thread.sleep(500);
                    }catch (Exception e1){
                        e1.printStackTrace();
                        continue;
                    }
                }

                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

        return "success!";

    }




    @RequestMapping("/gg")
    public String updateguigu(@RequestParam(value = "price") String price, @RequestParam(value = "totalPage") String totalPage){
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=12&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

        for (int i = 1; i <= Integer.valueOf(totalPage); i++) {
            try {
                String realUrl = url + String.valueOf(i);
                Document document = Jsoup.parse(new URL(realUrl), 10000);
                Element J_good_list = document.getElementById("J_good_list");
                Elements lis = J_good_list.getElementsByTag("li");

                for (Element li : lis) {
                    try {
                        Element iteminfo = li.getElementsByClass("item-info").get(0);
                        String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
                        System.out.println(detailUrl);
                        TlbbUser tlbbUser = qryDetail(detailUrl,"鬼谷");
                        tlbbUserMapper.insert(tlbbUser);
                        Thread.sleep(500);
                    }catch (Exception e1){
                        e1.printStackTrace();
                        continue;
                    }
                }

                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

        return "success!";

    }



    @RequestMapping("/tl")
    public String updatetianlong(@RequestParam(value = "price") String price, @RequestParam(value = "totalPage") String totalPage){
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&profession=12&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

        for (int i = 1; i <= Integer.valueOf(totalPage); i++) {
            try {
                String realUrl = url + String.valueOf(i);
                Document document = Jsoup.parse(new URL(realUrl), 10000);
                Element J_good_list = document.getElementById("J_good_list");
                Elements lis = J_good_list.getElementsByTag("li");

                for (Element li : lis) {
                    try {
                        Element iteminfo = li.getElementsByClass("item-info").get(0);
                        String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
                        System.out.println(detailUrl);
                        TlbbUser tlbbUser = qryDetail(detailUrl,"天龙");
                        tlbbUserMapper.insert(tlbbUser);
                        Thread.sleep(500);
                    }catch (Exception e1){
                        e1.printStackTrace();
                        continue;
                    }
                }

                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

        return "success!";

    }



    @RequestMapping("/all")
    public String updateAll(@RequestParam(value = "price") String price, @RequestParam(value = "totalPage") String totalPage){
        String url = "http://tl.cyg.changyou.com/goods/selling?world_id=0&price=1-" + price + "&have_chosen=price*1-400%20profession*8&page_num=";

        for (int i = 1; i <= Integer.valueOf(totalPage); i++) {
            try {
                String realUrl = url + String.valueOf(i);
                Document document = Jsoup.parse(new URL(realUrl), 10000);
                Element J_good_list = document.getElementById("J_good_list");
                Elements lis = J_good_list.getElementsByTag("li");

                for (Element li : lis) {
                    try {
                        Element iteminfo = li.getElementsByClass("item-info").get(0);
                        String detailUrl = iteminfo.getElementsByTag("a").get(0).attr("href");
                        System.out.println(detailUrl);
                        TlbbUser tlbbUser = qryDetail(detailUrl,"天龙");
                        tlbbUserMapper.insert(tlbbUser);
                        Thread.sleep(500);
                    }catch (Exception e1){
                        e1.printStackTrace();
                        continue;
                    }
                }

                Thread.sleep(500);

            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }

        return "success!";

    }







    public  TlbbUser qryDetail(String url,String mengpai) throws IOException {
        Document document = Jsoup.parse(new URL(url), 10000);

        // 基本信息 灵气体力啥的
        Element baseInfos = document.getElementsByClass("right w222 fn-clearfix").get(0).getElementsByClass("box2 h422").get(0);

        //  价格信息
        Element goodsInfos = document.getElementsByClass("goods-info").get(0).getElementsByClass("info-list").get(0);

        // 其他信息 宝石评分啥的
        Element otherInfos = document.getElementsByClass("left score-wrap w323").get(0).getElementsByClass("box2 fn-fix-info").get(0);

        // 装备信息，冰火玄毒穿刺伤害等信息
        Element userInfos = document.getElementsByClass("left w323").get(0).getElementsByClass("role-show").get(0);

        Elements scripts = document.getElementsByTag("script");
        Element baoguo = null;;
        String hongli = null;
        try {

            for (Element script : scripts) {
                if (script.attr("id").equals("tab_4")){
                    baoguo =script;
                }
            }
//            Elements divs = baoguo.getElementsByTag("div");
//            for (Element div : divs) {
//                if (div.html().contains("红利")){
//                    hongli = div.getElementsByTag("span").html();
//                }
//            }

            Pattern pattern = Pattern.compile("(?<=红利：<spanclass=\"span\">)([0-9]*)(?=\\</span>)");
            String tmp = replaceSpecialStr(baoguo.html());
            Matcher matcher = pattern.matcher((tmp));
            matcher.find();
            hongli = matcher.group();

        } catch (Exception e) {
            e.printStackTrace();
        }


        TlbbUser user = new TlbbUser();
        user.setSellUrl(url);
        user.setPrice(goodsInfos.getElementsByClass("ui-money-color").get(0).html().replace("￥",""));
        user.setLife(baseInfos.getElementsByTag("i").get(0).html());
        user.setSex(baseInfos.getElementsByClass("row2").get(1).getElementsByTag("span").html());
        user.setMingZhong(baseInfos.getElementsByClass("row2").get(14).getElementsByTag("span").html());
        user.setHuiXin(baseInfos.getElementsByClass("row2").get(16).getElementsByTag("span").html());
        user.setXiuLianScore(otherInfos.getElementsByClass("row2").get(3).getElementsByTag("span").html());
        user.setBaoShiScore(otherInfos.getElementsByClass("row2").get(5).getElementsByTag("span").html());
        user.setBinGong(userInfos.getElementsByAttributeValue("data-tip","bing").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("冰攻击 +",""));
        user.setHuoGong(userInfos.getElementsByAttributeValue("data-tip","huo").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("火攻击 +",""));
        user.setXuanGong(userInfos.getElementsByAttributeValue("data-tip","xuan").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("玄攻击 +",""));
        user.setDuGong(userInfos.getElementsByAttributeValue("data-tip","du").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("毒攻击 +",""));
        user.setChuanCi(userInfos.getElementsByAttributeValue("data-tip","sword").get(0).getElementsByClass("c-o-l").get(0).getElementsByTag("p").get(0).html().replace("穿刺伤害 ：",""));
        user.setMengPai(mengpai);
        if (hongli != null){
            user.setHongLi(hongli);
        }
        return user;
    }


    public static String replaceSpecialStr(String str) {
        String repl = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            repl = m.replaceAll("");
        }
        return repl;

    }

}
