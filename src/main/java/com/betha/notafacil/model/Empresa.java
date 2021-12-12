package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Empresa extends AbstractEntity {
    @Column(name="nomeEmpresa")
    private String nomeEmpresa;
    @Column(name="razaoSocial")
    private String razaoSocial;
    @Column(name="cnpj")
    private String cnpj;
    @Column(name="porteEmpresa")
    private PorteEmpresa porteEmpresa; // ENUM
    @Column(name="optante")
    private String optante; //ENUM
    @Column(name="CEP")
    private String CEP;
    @Column(name="situacao")
    private String situacao; // ENUM ultima situacao: (B,S,C,P,A) // Baixado, Suspenso, Cancelado, Provisorio, A- Em Atividade


    @NotNull
    @ManyToOne
    @JoinColumn(name="i_ruas",referencedColumnName = "ID")
    private Rua rua;

    @NotNull
    @ManyToOne
    @JoinColumn(name="i_responsaveis",referencedColumnName = "ID")
    private Responsavel responsavel; //Classe

    @NotNull
    @ManyToOne
    @JoinColumn(name="i_atividades",referencedColumnName = "ID")
    private Atividade atividade;


    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getOptante() {
        return optante;
    }

    public void setOptante(String optante) {
        this.optante = optante;
    }

    public String getCEP() {
        return CEP;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public PorteEmpresa getPorteEmpresa() {
        return porteEmpresa;
    }

    public void setPorteEmpresa(PorteEmpresa porteEmpresa) {
        this.porteEmpresa = porteEmpresa;
    }
}
