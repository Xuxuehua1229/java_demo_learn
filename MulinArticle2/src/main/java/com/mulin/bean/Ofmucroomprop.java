package com.mulin.bean;

public class Ofmucroomprop extends OfmucroompropKey {
    private String propvalue;

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue == null ? null : propvalue.trim();
    }
}