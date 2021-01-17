package com.zxd.tlbbcyg.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "tlbbuser")
public class TlbbUser {
    private long id;

    private String sex;

    private String price;

    @TableField(value = "sellurl")
    private String sellUrl;

    @TableField(value = "life")
    private String life;

    @TableField(value = "chuanCi")
    private String chuanCi;

    @TableField(value = "huoGong")
    private String huoGong;

    @TableField(value = "binGong")
    private String binGong;

    @TableField(value = "duGong")
    private String duGong;

    @TableField(value = "xuanGong")
    private String xuanGong;

    @TableField(value = "huiXin")
    private String huiXin;

    @TableField(value = "mingZhong")
    private String mingZhong;

    @TableField(value = "xiuLianScore")
    private String xiuLianScore;

    @TableField(value = "baoShiScore")
    private String baoShiScore;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellUrl() {
        return sellUrl;
    }

    public void setSellUrl(String sellUrl) {
        this.sellUrl = sellUrl;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String getChuanCi() {
        return chuanCi;
    }

    public void setChuanCi(String chuanCi) {
        this.chuanCi = chuanCi;
    }

    public String getHuoGong() {
        return huoGong;
    }

    public void setHuoGong(String huoGong) {
        this.huoGong = huoGong;
    }

    public String getBinGong() {
        return binGong;
    }

    public void setBinGong(String binGong) {
        this.binGong = binGong;
    }

    public String getDuGong() {
        return duGong;
    }

    public void setDuGong(String duGong) {
        this.duGong = duGong;
    }

    public String getXuanGong() {
        return xuanGong;
    }

    public void setXuanGong(String xuanGong) {
        this.xuanGong = xuanGong;
    }

    public String getHuiXin() {
        return huiXin;
    }

    public void setHuiXin(String huiXin) {
        this.huiXin = huiXin;
    }

    public String getMingZhong() {
        return mingZhong;
    }

    public void setMingZhong(String mingZhong) {
        this.mingZhong = mingZhong;
    }

    public String getXiuLianScore() {
        return xiuLianScore;
    }

    public void setXiuLianScore(String xiuLianScore) {
        this.xiuLianScore = xiuLianScore;
    }

    public String getBaoShiScore() {
        return baoShiScore;
    }

    public void setBaoShiScore(String baoShiScore) {
        this.baoShiScore = baoShiScore;
    }
}
