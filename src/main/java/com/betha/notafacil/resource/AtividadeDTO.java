package com.betha.notafacil.resource;

import com.betha.notafacil.model.Atividade;

public class AtividadeDTO {
    private Long id;
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        dto.setId(atividade.getId());
        dto.setDescricao(atividade.getDescricao());

        return dto;
    }

    public static Atividade fromDTO(AtividadeDTO dto) {
        Atividade entity = new Atividade();
        entity.setId(dto.getId());
        entity.setDescricao(dto.getDescricao());
        return entity;
    }
}
