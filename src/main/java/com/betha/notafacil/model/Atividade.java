package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atividade  extends AbstractEntity {

    @Column(name="descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name="id_servico",referencedColumnName = "codigo")
    private ListaServicos listaServicos;

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
