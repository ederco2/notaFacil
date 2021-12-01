package com.betha.notafacil.resource;

import com.betha.notafacil.model.Bairro;

public class BairroDTO {
    private String id;
    private String nome;
    private String populacao;
    private CidadeDTO cidade;

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

    public CidadeDTO getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }

    public static BairroDTO toDTO(Bairro bairro) {
        BairroDTO dto = new BairroDTO();
        dto.setId(bairro.getId().toString());
        dto.setNome(bairro.getNome());
        dto.setPopulacao(bairro.getPopulacao());
        dto.setCidade(bairro.getCidade() != null ? CidadeDTO.toDTO(bairro.getCidade()): null);
        return dto;
    }

    public static Bairro fromDTO(BairroDTO dto) {
        Bairro entity = new Bairro();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
        return entity;
    }

}
