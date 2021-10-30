package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractRegion;

public class Cidade extends AbstractRegion {
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
