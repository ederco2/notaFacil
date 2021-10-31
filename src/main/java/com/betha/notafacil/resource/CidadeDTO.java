package com.betha.notafacil.resource;

import com.betha.notafacil.model.Cidade;

public class CidadeDTO {
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public static CidadeDTO toDTO(Cidade cidade) {
        CidadeDTO dto = new CidadeDTO();
        dto.setId(cidade.getId());
        dto.setNome(cidade.getNome());
        dto.setPopulacao(cidade.getPopulacao());

        return dto;
    }

    public static Cidade fromDTO(CidadeDTO dto) {
        Cidade entity = new Cidade();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
        return entity;
    }
}
