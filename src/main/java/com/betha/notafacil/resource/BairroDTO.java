package com.betha.notafacil.resource;

import com.betha.notafacil.model.Bairro;

public class BairroDTO {
    private Long id;
    private String nome;

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

    public static BairroDTO toDTO(Bairro bairro) {
        BairroDTO dto = new BairroDTO();
        dto.setId(bairro.getId());
        dto.setNome(bairro.getNome());
        return dto;
    }

    public static Bairro fromDTO(BairroDTO dto) {
        Bairro entity = new Bairro();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        return entity;
    }

}
