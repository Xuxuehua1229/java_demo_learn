package com.mulin.bean;

public class Muexamplerooms {
    private Integer exampleid;

    private String examplename;

    private String creationdate;

    private Integer exampletype;

    public Integer getExampleid() {
        return exampleid;
    }

    public void setExampleid(Integer exampleid) {
        this.exampleid = exampleid;
    }

    public String getExamplename() {
        return examplename;
    }

    public void setExamplename(String examplename) {
        this.examplename = examplename == null ? null : examplename.trim();
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public Integer getExampletype() {
        return exampletype;
    }

    public void setExampletype(Integer exampletype) {
        this.exampletype = exampletype;
    }
}