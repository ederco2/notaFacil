package com.betha.notafacil.resource;


import com.betha.notafacil.model.Responsavel;
import com.betha.notafacil.model.Rua;

public class ResponsavelDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String celular;
    private String telefone;
    private RuaDTO rua;

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

    public RuaDTO getRua() {
        return rua;
    }

    public void setRua(RuaDTO rua) {
        this.rua = rua;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static ResponsavelDTO toDTO(Responsavel responsavel){
        ResponsavelDTO dto =  new ResponsavelDTO();
        dto.setId(responsavel.getId());
        dto.setRua(RuaDTO.toDTO(responsavel.getRua()));
        dto.setCelular(responsavel.getCelular());
        dto.setCpf(responsavel.getCpf());
        dto.setNome(responsavel.getNome());
        dto.setTelefone(responsavel.getTelefone());
        return dto;
    }

    public static Responsavel fromDTO(ResponsavelDTO dto){
        Responsavel entity = new Responsavel();
        entity.setId(dto.getId());
        entity.setRua(RuaDTO.fromDTO(dto.getRua()));
        entity.setCelular(dto.getCelular());
        entity.setCpf(dto.getCpf());
        entity.setNome(dto.getNome());
        entity.setTelefone(dto.getTelefone());
        return entity;
    }
}
