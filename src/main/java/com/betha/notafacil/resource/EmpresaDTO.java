package com.betha.notafacil.resource;

import com.betha.notafacil.model.Atividade;
import com.betha.notafacil.model.Bairro;
import com.betha.notafacil.model.Empresa;
import com.betha.notafacil.model.Responsavel;

public class EmpresaDTO {
    private Long id;
    private String nomeEmpresa;
    private String razaoSocial;
    private String cnpj;
    private Integer porteEmpresa; // ENUM
    private String optante; //ENUM
    private Bairro bairro; //Classe
    private String CEP;
    private Responsavel responsavel; //Classe
    private String situacao; // ENUM ultima situacao: (B,S,C,P,A) // Baixado, Suspenso, Cancelado, Provisorio, A- Em Atividade
    private Atividade atividade; //Classe

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public static EmpresaDTO toDTO(Empresa Empresa) {
        EmpresaDTO dto = new EmpresaDTO();
        dto.setId(Empresa.getId());
        dto.setAtividade(Empresa.getAtividade());
        dto.setBairro(Empresa.getBairro());
        dto.setCEP(Empresa.getCEP());
        dto.setCnpj(Empresa.getCnpj());
        dto.setNomeEmpresa(Empresa.getNomeEmpresa());
        dto.setOptante(Empresa.getOptante());
        dto.setPorteEmpresa(Empresa.getPorteEmpresa());
        dto.setRazaoSocial(Empresa.getRazaoSocial());
        dto.setResponsavel(Empresa.getResponsavel());
        dto.setSituacao(Empresa.getSituacao());
        return  dto;
    }
    public static Empresa toDTO(EmpresaDTO dto) {
        Empresa entity = new Empresa();
        entity.setId(dto.getId());
        entity.setAtividade(dto.getAtividade());
        entity.setBairro(dto.getBairro());
        entity.setCEP(dto.getCEP());
        entity.setCnpj(dto.getCnpj());
        entity.setNomeEmpresa(dto.getNomeEmpresa());
        entity.setOptante(dto.getOptante());
        entity.setPorteEmpresa(dto.getPorteEmpresa());
        entity.setRazaoSocial(dto.getRazaoSocial());
        entity.setResponsavel(dto.getResponsavel());
        entity.setSituacao(dto.getSituacao());
        return  entity;
    }
}