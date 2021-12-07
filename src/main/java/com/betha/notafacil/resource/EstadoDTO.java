package com.betha.notafacil.resource;

import com.betha.notafacil.model.Estado;

public class EstadoDTO {
    private String id;
    private String nome;
    private String populacao;
    private String uf;

    private PaisDTO pais;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        this.pais = pais;
    }

    public static EstadoDTO toDTO(Estado estado){
        EstadoDTO dto =  new EstadoDTO();
        dto.setId(estado.getId().toString());
        dto.setNome(estado.getNome());
        dto.setPopulacao(estado.getPopulacao());
        dto.setUf(estado.getUf());
        dto.setPais(estado.getPais() != null ? PaisDTO.toDTO(estado.getPais()) : null);
        return dto;
    }

    public static Estado fromDTO(EstadoDTO dto){
        Estado entity = new Estado();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
        entity.setUf(dto.getUf());
        //entity.setPais(dto.getPais());
        return entity;
    }
}
