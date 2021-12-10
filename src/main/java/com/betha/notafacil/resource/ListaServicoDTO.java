package com.betha.notafacil.resource;

import com.betha.notafacil.model.Estado;
import com.betha.notafacil.model.ListaServicos;

public class ListaServicoDTO {
    private String id;
    private Integer codigo;
    private String descricao;
    private Double issVariavel;
    private Double issFixo; // anual
    private String item; // 1.01 ou 1.02

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

    public Double getIssVariavel() {
        return issVariavel;
    }

    public void setIssVariavel(Double issVariavel) {
        this.issVariavel = issVariavel;
    }

    public Double getIssFixo() {
        return issFixo;
    }

    public void setIssFixo(Double issFixo) {
        this.issFixo = issFixo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static ListaServicoDTO toDTO(ListaServicos listaServicos){
        ListaServicoDTO dto =  new ListaServicoDTO();
        dto.setId(listaServicos.getId().toString());
        dto.setCodigo(listaServicos.getCodigo());
        dto.setDescricao(listaServicos.getDescricao());
        dto.setIssFixo(listaServicos.getIssFixo());
        dto.setIssVariavel(listaServicos.getIssVariavel());
        dto.setItem(listaServicos.getItem());
        return dto;
    }

    public static ListaServicos fromDTO(ListaServicoDTO dto){
        ListaServicos entity = new ListaServicos();
        entity.setId(Long.getLong(dto.getId()));
        entity.setCodigo(dto.getCodigo());
        entity.setDescricao(dto.descricao);
        entity.setIssFixo(dto.getIssFixo());
        entity.setIssVariavel(dto.getIssVariavel());
        entity.setItem(dto.getItem());
        return entity;
    }
}
