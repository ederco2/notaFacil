package com.betha.notafacil.resource;

import com.betha.notafacil.model.Contribuinte;
import com.betha.notafacil.model.Rua;
import com.betha.notafacil.model.TipoDocumento;

import java.time.LocalDate;
import java.util.Date;

public class ContribuinteDTO {
    private String id;
    private String nome;
    private String documento;
    private TipoDocumento tipodoc;
    private LocalDate dataNascimento;
    private RuaDTO rua;


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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(TipoDocumento tipodoc) {
        this.tipodoc = tipodoc;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public RuaDTO getRua() {
        return rua;
    }

    public void setRua(RuaDTO rua) {
        this.rua = rua;
    }

    public static ContribuinteDTO toDTO(Contribuinte contribuinte){
        ContribuinteDTO dto =  new ContribuinteDTO();
        dto.setId(contribuinte.getId().toString());
        dto.setRua(contribuinte.getRua() != null ? RuaDTO.toDTO(contribuinte.getRua()) : null);
        dto.setNome(contribuinte.getNome());
        dto.setDocumento(contribuinte.getDocumento());
        dto.setTipodoc(contribuinte.getTipodoc());
        dto.setDataNascimento(contribuinte.getDataNascimento());
        return dto;
    }

    public static Contribuinte fromDTO(ContribuinteDTO dto){
        Contribuinte entity = new Contribuinte();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setDocumento(dto.getDocumento());
        entity.setTipodoc(dto.getTipodoc());
        entity.setDataNascimento(dto.getDataNascimento());
        return entity;
    }
}
