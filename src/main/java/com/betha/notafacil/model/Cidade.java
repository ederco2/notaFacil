package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractRegion;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Cidade extends AbstractRegion {

    @NotNull
    @ManyToOne
    @JoinColumn(name="i_estados",referencedColumnName = "ID")
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
