package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Contribuinte extends AbstractEntity {
    @NotNull
    private String nome;
    @NotNull
    private String documento;
    @NotNull
    private TipoDocumento tipodoc;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    @ManyToOne
    @JoinColumn(name="i_ruas",referencedColumnName = "ID")
    private Rua rua;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(TipoDocumento tipodoc) {
        this.tipodoc = tipodoc;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }
}
