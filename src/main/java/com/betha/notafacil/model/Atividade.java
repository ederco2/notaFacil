package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

public class Atividade  extends AbstractEntity {
    private String descricao;
    private ListaServicos listaServicos;
    private Double Aliquota;//teste

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ListaServicos getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(ListaServicos listaServicos) {
        this.listaServicos = listaServicos;
    }


}
