package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractRegion;

public class Estado extends AbstractRegion {
    private String uf;

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
