package com.mulin.bean;

public class Mufamilyuser extends MufamilyuserKey {
    private Integer ismaster;

    private String joinfamilydate;

    public Integer getIsmaster() {
        return ismaster;
    }

    public void setIsmaster(Integer ismaster) {
        this.ismaster = ismaster;
    }

    public String getJoinfamilydate() {
        return joinfamilydate;
    }

    public void setJoinfamilydate(String joinfamilydate) {
        this.joinfamilydate = joinfamilydate == null ? null : joinfamilydate.trim();
    }
}