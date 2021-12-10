package com.betha.notafacil.resource;

import com.betha.notafacil.model.*;

import java.time.LocalDate;

public class EmissaoNotaDTO {
    private String id;
    private LocalDate data;
    private TipoServico tipoServico;
    private StatusServico statusServico;
    private Double qtdServico;
    private Double valorServico;
    private ContribuinteDTO contribuinte;
    private ListaServicoDTO listaServicos;
    private EmpresaDTO empresa;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public StatusServico getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(StatusServico statusServico) {
        this.statusServico = statusServico;
    }

    public Double getQtdServico() {
        return qtdServico;
    }

    public void setQtdServico(Double qtdServico) {
        this.qtdServico = qtdServico;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public ContribuinteDTO getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(ContribuinteDTO contribuinte) {
        this.contribuinte = contribuinte;
    }

    public ListaServicoDTO getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(ListaServicoDTO listaServicos) {
        this.listaServicos = listaServicos;
    }

    public EmpresaDTO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }


    public static EmissaoNotaDTO toDTO(EmissaoNotas emissaoNotas) {
        EmissaoNotaDTO dto = new EmissaoNotaDTO();
        dto.setId(emissaoNotas.getId().toString());
        dto.setData(emissaoNotas.getData());
        dto.setStatusServico(emissaoNotas.getStatusServico());
        dto.setQtdServico(emissaoNotas.getQtdServico());
        dto.setTipoServico(emissaoNotas.getTipoServico());
        dto.setValorServico(emissaoNotas.getValorServico());
        dto.setListaServicos(ListaServicoDTO.toDTO(emissaoNotas.getListaServicos()));
        dto.setContribuinte(ContribuinteDTO.toDTO(emissaoNotas.getContribuinte()));
        dto.setEmpresa(EmpresaDTO.toDTO(emissaoNotas.getEmpresa()));
        return dto;
    }

    public static EmissaoNotas fromDTO(EmissaoNotaDTO dto) {
        EmissaoNotas entity = new EmissaoNotas();
        entity.setId(Long.getLong(dto.getId()));
        entity.setData(dto.getData());
        entity.setTipoServico(dto.getTipoServico());
        entity.setContribuinte(ContribuinteDTO.fromDTO(dto.getContribuinte()));
        entity.setEmpresa(EmpresaDTO.fromDTO(dto.getEmpresa()));
        entity.setListaServicos(ListaServicoDTO.fromDTO(dto.getListaServicos()));
        entity.setStatusServico(dto.getStatusServico());
        return entity;
    }
}
