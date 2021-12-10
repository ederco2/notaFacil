package com.betha.notafacil.resource;

import com.betha.notafacil.model.Empresa;

public class EmpresaDTO {
    private String id;
    private String nomeEmpresa;
    private String razaoSocial;
    private String cnpj;
    private Integer porteEmpresa; // ENUM
    private String optante; //ENUM
    private RuaDTO rua; //Classe
    private String CEP;
    private ResponsavelDTO responsavel; //Classe
    private String situacao; // ENUM ultima situacao: (B,S,C,P,A) // Baixado, Suspenso, Cancelado, Provisorio, A- Em Atividade
    private AtividadeDTO atividade; //Classe

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

    public RuaDTO getRua() {
        return rua;
    }

    public void setRua(RuaDTO rua) {
        this.rua = rua;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public ResponsavelDTO getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelDTO responsavel) {
        this.responsavel = responsavel;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public AtividadeDTO getAtividade() {
        return atividade;
    }

    public void setAtividade(AtividadeDTO atividade) {
        this.atividade = atividade;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public static EmpresaDTO toDTO(Empresa empresa) {
        EmpresaDTO dto = new EmpresaDTO();
        dto.setId(empresa.getId().toString());
        dto.setCEP(empresa.getCEP());
        dto.setCnpj(empresa.getCnpj());
        dto.setNomeEmpresa(empresa.getNomeEmpresa());
        dto.setOptante(empresa.getOptante());
        dto.setPorteEmpresa(empresa.getPorteEmpresa());
        dto.setRazaoSocial(empresa.getRazaoSocial());
        dto.setSituacao(empresa.getSituacao());
        dto.setRua(RuaDTO.toDTO(empresa.getRua()));
        dto.setResponsavel(ResponsavelDTO.toDTO(empresa.getResponsavel()));
        dto.setAtividade(AtividadeDTO.toDTO(empresa.getAtividade()));
        return  dto;
    }
    public static Empresa fromDTO(EmpresaDTO dto) {
        Empresa entity = new Empresa();
        entity.setId(Long.getLong(dto.getId()));
        entity.setSituacao(dto.getSituacao());
        entity.setRazaoSocial(dto.getRazaoSocial());
        entity.setCEP(dto.getCEP());
        entity.setCnpj(dto.getCnpj());
        entity.setNomeEmpresa(dto.getNomeEmpresa());
        entity.setOptante(dto.getOptante());
        entity.setPorteEmpresa(dto.getPorteEmpresa());
        entity.setRua(RuaDTO.fromDTO(dto.getRua()));
        entity.setAtividade(AtividadeDTO.fromDTO(dto.getAtividade()));
        entity.setResponsavel(ResponsavelDTO.fromDTO(dto.getResponsavel()));

        return  entity;
    }
}