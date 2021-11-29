package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractRegion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Estado extends AbstractRegion {

    @Column(name="uf")
    private String uf;

    @ManyToOne
    @JoinColumn(name = "I_PAISES", referencedColumnName = "ID")
    private Pais pais;

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
