package com.betha.notafacil.resource;

import com.betha.notafacil.model.EmissaoNotas;
import com.betha.notafacil.model.StatusServico;
import com.betha.notafacil.model.TipoServico;

import java.time.LocalDate;

public class EmissaoNotasDTO {
    private String id;
    private LocalDate data;
    private TipoServico tipoServico;
    private StatusServico statusServico;
    private Double qtdServico;
    private Double valorServico;
    private ContribuinteDTO contribuinte;
    private EmpresaDTO empresa;
    private ListaServicoDTO listaServicos;

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

    public EmpresaDTO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }

    public ListaServicoDTO getListaServico() {
        return listaServicos;
    }

    public void setListaServico(ListaServicoDTO listaServicos) {
        this.listaServicos = listaServicos;
    }

    public static EmissaoNotasDTO toDTO(EmissaoNotas emissaoNotas){
        EmissaoNotasDTO dto = new EmissaoNotasDTO();
        dto.setId(emissaoNotas.getId().toString());
        dto.setData(emissaoNotas.getData());
        dto.setValorServico(emissaoNotas.getValorServico());
        dto.setTipoServico(emissaoNotas.getTipoServico());
        dto.setQtdServico(emissaoNotas.getQtdServico());
        dto.setStatusServico(emissaoNotas.getStatusServico());
        dto.setContribuinte(ContribuinteDTO.toDTO(emissaoNotas.getContribuinte()));
        dto.setEmpresa(EmpresaDTO.toDTO(emissaoNotas.getEmpresa()));
        dto.setListaServico(ListaServicoDTO.toDTO(emissaoNotas.getListaServicos()));
    return dto;
    }

    public static EmissaoNotas fromDTO(EmissaoNotasDTO dto){
        EmissaoNotas entity = new EmissaoNotas();
        entity.setId(Long.getLong(dto.getId()));
        entity.setData(dto.getData());
        entity.setQtdServico(dto.getQtdServico());
        entity.setValorServico(dto.getValorServico());
        entity.setTipoServico(dto.getTipoServico());
        entity.setStatusServico(dto.getStatusServico());
        entity.setContribuinte(ContribuinteDTO.fromDTO(dto.getContribuinte()));
        entity.setEmpresa(EmpresaDTO.fromDTO(dto.getEmpresa()));
        entity.setListaServicos(ListaServicoDTO.fromDTO(dto.getListaServico()));
        return entity;
    }
}
