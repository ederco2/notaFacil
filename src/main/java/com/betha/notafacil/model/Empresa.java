package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Empresa extends AbstractEntity {
    @Column(name="nomeEmpresa")
    private String nomeEmpresa;
    @Column(name="razaoSocial")
    private String razaoSocial;
    @Column(name="cnpj")
    private String cnpj;
    @Column(name="porteEmpresa")
    private Integer porteEmpresa; // ENUM
    @Column(name="optante")
    private String optante; //ENUM
    @Column(name="CEP")
    private String CEP;
    @Column(name="situacao")
    private String situacao; // ENUM ultima situacao: (B,S,C,P,A) // Baixado, Suspenso, Cancelado, Provisorio, A- Em Atividade

    @ManyToOne
    @JoinColumn(name="i_bairros",referencedColumnName = "ID")
    private Bairro bairro; //Classe
    @ManyToOne
    @JoinColumn(name="i_responsaveis",referencedColumnName = "ID")
    private Responsavel responsavel; //Classe
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

    public Integer getPorteEmpresa() {
        return porteEmpresa;
    }

    public void setPorteEmpresa(Integer porteEmpresa) {
        this.porteEmpresa = porteEmpresa;
    }

    public String getOptante() {
        return optante;
    }

    public void setOptante(String optante) {
        this.optante = optante;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
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
}
