package com.betha.notafacil.resource;

import com.betha.notafacil.model.Pais;

public class PaisDTO {

    private String id;
    private String nome;
    private String populacao;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static PaisDTO toDTO(Pais pais) {
        PaisDTO dto = new PaisDTO();
        dto.setId(pais.getId().toString());
        dto.setNome(pais.getNome());
        dto.setPopulacao(pais.getPopulacao());
        return dto;
    }

    public static Pais fromDTO(PaisDTO dto) {
        Pais entity = new Pais();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
        return entity;
    }
}
