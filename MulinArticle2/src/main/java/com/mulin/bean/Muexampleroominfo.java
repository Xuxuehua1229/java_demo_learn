package com.mulin.bean;

public class Muexampleroominfo {
    private Integer exampleid;

    private String roomidorfamilyname;

    private String creationdate;

    public Integer getExampleid() {
        return exampleid;
    }

    public void setExampleid(Integer exampleid) {
        this.exampleid = exampleid;
    }

    public String getRoomidorfamilyname() {
        return roomidorfamilyname;
    }

    public void setRoomidorfamilyname(String roomidorfamilyname) {
        this.roomidorfamilyname = roomidorfamilyname == null ? null : roomidorfamilyname.trim();
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }
}