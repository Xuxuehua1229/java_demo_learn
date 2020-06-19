package com.mulin.bean;

public class MuexampleroomsWithBLOBs extends Muexamplerooms {
    private String headimage;

    private String introducecontent;

    public String getHeadimage() {
        return headimage;
    }

    public void setHeadimage(String headimage) {
        this.headimage = headimage == null ? null : headimage.trim();
    }

    public String getIntroducecontent() {
        return introducecontent;
    }

    public void setIntroducecontent(String introducecontent) {
        this.introducecontent = introducecontent == null ? null : introducecontent.trim();
    }
}