package com.mulin.bean;

public class Mustreets {
    private Long streetid;

    private String streetname;

    private Long districtid;

    public Long getStreetid() {
        return streetid;
    }

    public void setStreetid(Long streetid) {
        this.streetid = streetid;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname == null ? null : streetname.trim();
    }

    public Long getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Long districtid) {
        this.districtid = districtid;
    }
}