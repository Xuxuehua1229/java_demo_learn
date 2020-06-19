package com.mulin.bean;

public class MucollectionWithBLOBs extends Mucollection {
    private String context;

    private String activitycontext;

    private String coverimg;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getActivitycontext() {
        return activitycontext;
    }

    public void setActivitycontext(String activitycontext) {
        this.activitycontext = activitycontext == null ? null : activitycontext.trim();
    }

    public String getCoverimg() {
        return coverimg;
    }

    public void setCoverimg(String coverimg) {
        this.coverimg = coverimg == null ? null : coverimg.trim();
    }
}