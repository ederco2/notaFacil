package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractRegion;

public class Bairro extends AbstractRegion {

    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
