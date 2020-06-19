package com.mulin.bean;

public class Mutheme {
    private Integer id;

    private String username;

    private String creationdate;

    private Integer type;

    private String title;

    private String imgurl;

    private String themedesc;

    private String mark1;

    private String mark2;

    private String mark3;

    private String mark4;

    private String mark5;

    private Integer roomid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getThemedesc() {
        return themedesc;
    }

    public void setThemedesc(String themedesc) {
        this.themedesc = themedesc == null ? null : themedesc.trim();
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

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }
}