package com.mulin.bean;

public class Mucomment {
    private Integer commentid;

    private String activityid;

    private String commentname;

    private String writebackname;

    private String creationdate;

    private Integer writebacktype;

    private Integer saygood;

    private String commentcontext;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getActivityid() {
        return activityid;
    }

    public void setActivityid(String activityid) {
        this.activityid = activityid == null ? null : activityid.trim();
    }

    public String getCommentname() {
        return commentname;
    }

    public void setCommentname(String commentname) {
        this.commentname = commentname == null ? null : commentname.trim();
    }

    public String getWritebackname() {
        return writebackname;
    }

    public void setWritebackname(String writebackname) {
        this.writebackname = writebackname == null ? null : writebackname.trim();
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public Integer getWritebacktype() {
        return writebacktype;
    }

    public void setWritebacktype(Integer writebacktype) {
        this.writebacktype = writebacktype;
    }

    public Integer getSaygood() {
        return saygood;
    }

    public void setSaygood(Integer saygood) {
        this.saygood = saygood;
    }

    public String getCommentcontext() {
        return commentcontext;
    }

    public void setCommentcontext(String commentcontext) {
        this.commentcontext = commentcontext == null ? null : commentcontext.trim();
    }
}