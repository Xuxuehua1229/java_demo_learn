package com.mulin.bean;

public class Ofuserprop extends OfuserpropKey {
    private String propvalue;

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue == null ? null : propvalue.trim();
    }
}