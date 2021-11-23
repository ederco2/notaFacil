package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractRegion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Estado extends AbstractRegion {
    @NotNull(message = "Bairro nao pode ser nulo!")
    @Column(name="uf")
    private String uf;

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
