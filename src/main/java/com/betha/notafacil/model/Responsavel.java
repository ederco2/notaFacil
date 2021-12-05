package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Responsavel extends AbstractEntity {
    @Column(name="nome")
    private String nome;
    @Column(name="cpf")
    private String cpf;
    @Column(name="celular")
    private String celular;
    @Column(name="telefe")
    private String telefone;

    @ManyToOne
    @JoinColumn(name="i_ruas",referencedColumnName = "ID")
    private Rua rua;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }
}
