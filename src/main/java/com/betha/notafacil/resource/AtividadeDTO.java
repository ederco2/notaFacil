package com.betha.notafacil.resource;

import com.betha.notafacil.model.Atividade;

public class AtividadeDTO {
    private String id;
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static AtividadeDTO toDTO(Atividade atividade) {
        AtividadeDTO dto = new AtividadeDTO();
        dto.setId(atividade.getId().toString());
        dto.setDescricao(atividade.getDescricao());

        return dto;
    }

    public static Atividade fromDTO(AtividadeDTO dto) {
        Atividade entity = new Atividade();
        entity.setId(Long.getLong(dto.getId()));
        entity.setDescricao(dto.getDescricao());
        return entity;
    }
}
