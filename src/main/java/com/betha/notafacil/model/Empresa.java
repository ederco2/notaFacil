package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

public class Empresa extends AbstractEntity {

    private String nomeEmpresa;
    private String razaoSocial;
    private String cnpj;
    private Integer porteEmpresa; // lista de selecao
    private String optante; //sim ou nao
    private Bairro bairro;
    private String CEP;
    private Responsavel responsavel;
    private String situacao; //ultima situacao: (B,S,C,P,A) // Baixado, Suspenso, Cancelado, Provisorio, A- Em Atividade
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

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
