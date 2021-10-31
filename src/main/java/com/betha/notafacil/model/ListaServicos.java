package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ListaServicos extends AbstractEntity {
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "iss_variavel")
    private Double issVariavel;
    @Column(name = "iss_fixo")
    private Double issFixo; // anual
    @Column(name = "item")
    private String item; // 1.01 ou 1.02

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getIssVariavel() {
        return issVariavel;
    }

    public void setIssVariavel(Double issVariavel) {
        this.issVariavel = issVariavel;
    }

    public Double getIssFixo() {
        return issFixo;
    }

    public void setIssFixo(Double issFixo) {
        this.issFixo = issFixo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
