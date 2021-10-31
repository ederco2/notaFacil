package com.betha.notafacil.resource;

import com.betha.notafacil.model.Estado;

public class EstadoDTO {
    private Long id;
    private String nome;
    private String populacao;
    private String uf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public static EstadoDTO toDTO(Estado estado){
        EstadoDTO dto =  new EstadoDTO();
        dto.setId(estado.getId());
        dto.setNome(estado.getNome());
        dto.setPopulacao(estado.getPopulacao());
        dto.setUf(estado.getUf());
        return dto;
    }

    public static Estado fromDTO(EstadoDTO dto){
        Estado entity = new Estado();
        entity.setId(dto.getId());
        entity.setNome(dto.nome);
        entity.setPopulacao(dto.getPopulacao());
        entity.setUf(dto.getUf());
        return entity;
    }
}
