package com.betha.notafacil.resource;

import com.betha.notafacil.model.Cidade;

public class CidadeDTO {
    private String id;
    private String nome;
    private String populacao;
    private EstadoDTO estado;

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

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public static CidadeDTO toDTO(Cidade cidade) {
        CidadeDTO dto = new CidadeDTO();
        dto.setId(cidade.getId().toString());
        dto.setNome(cidade.getNome());
        dto.setPopulacao(cidade.getPopulacao());
        dto.setEstado(cidade.getEstado() != null ? EstadoDTO.toDTO(cidade.getEstado()) : null);
        return dto;
    }

    public static Cidade fromDTO(CidadeDTO dto) {
        Cidade entity = new Cidade();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
        return entity;
    }
}
