package com.mulin.bean;

public class GoodsWithBLOBs extends Goods {
    private String gooddesc;

    private String goodimg;

    private String mark1;

    private String mark2;

    private String mark3;

    private String mark4;

    private String mark5;

    public String getGooddesc() {
        return gooddesc;
    }

    public void setGooddesc(String gooddesc) {
        this.gooddesc = gooddesc == null ? null : gooddesc.trim();
    }

    public String getGoodimg() {
        return goodimg;
    }

    public void setGoodimg(String goodimg) {
        this.goodimg = goodimg == null ? null : goodimg.trim();
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1 == null ? null : mark1.trim();
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2 == null ? null : mark2.trim();
    }

    public String getMark3() {
        return mark3;
    }

    public void setMark3(String mark3) {
        this.mark3 = mark3 == null ? null : mark3.trim();
    }

    public String getMark4() {
        return mark4;
    }

    public void setMark4(String mark4) {
        this.mark4 = mark4 == null ? null : mark4.trim();
    }

    public String getMark5() {
        return mark5;
    }

    public void setMark5(String mark5) {
        this.mark5 = mark5 == null ? null : mark5.trim();
    }
}