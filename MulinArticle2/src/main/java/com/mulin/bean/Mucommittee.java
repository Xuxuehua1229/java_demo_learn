package com.mulin.bean;

public class Mucommittee {
    private Long committeeid;

    private String committeename;

    private Long streetid;

    public Long getCommitteeid() {
        return committeeid;
    }

    public void setCommitteeid(Long committeeid) {
        this.committeeid = committeeid;
    }

    public String getCommitteename() {
        return committeename;
    }

    public void setCommitteename(String committeename) {
        this.committeename = committeename == null ? null : committeename.trim();
    }

    public Long getStreetid() {
        return streetid;
    }

    public void setStreetid(Long streetid) {
        this.streetid = streetid;
    }
}