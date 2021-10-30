package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

public class ListaServicos extends AbstractEntity {
    private String descricao;
    private Double aliquota;
    private String item; // 1.01 ou 1.02

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
