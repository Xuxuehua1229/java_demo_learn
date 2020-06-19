package com.mulin.bean;

public class Mugoods {
    private Integer goodsreleaseid;

    private Integer goodsid;

    private String username;

    private String familyname;

    private String creationdate;

    private String updatedate;

    private String deldate;

    private String goodsname;

    private String price;

    private String salesprice;

    private Integer roomid;

    private Integer activityid;

    private Integer istop;

    private Integer isdel;

    public Integer getGoodsreleaseid() {
        return goodsreleaseid;
    }

    public void setGoodsreleaseid(Integer goodsreleaseid) {
        this.goodsreleaseid = goodsreleaseid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname == null ? null : familyname.trim();
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate == null ? null : updatedate.trim();
    }

    public String getDeldate() {
        return deldate;
    }

    public void setDeldate(String deldate) {
        this.deldate = deldate == null ? null : deldate.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(String salesprice) {
        this.salesprice = salesprice == null ? null : salesprice.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getIstop() {
        return istop;
    }

    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}