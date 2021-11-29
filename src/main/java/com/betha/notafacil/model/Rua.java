package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Rua  extends AbstractEntity {

    private String cep;

    private String nome;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "i_bairros", referencedColumnName = "ID")
    private Bairro bairro;
    @NotNull
    private TipoRua tipo;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public TipoRua getTipo() {
        return tipo;
    }

    public void setTipo(TipoRua tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
