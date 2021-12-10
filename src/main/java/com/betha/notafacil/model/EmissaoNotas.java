package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class EmissaoNotas  extends AbstractEntity {
    private LocalDate data;
    private TipoServico tipoServico;
    private StatusServico statusServico;
    private Double qtdServico;
    private Double valorServico;

    @NotNull
    @ManyToOne
    @JoinColumn(name="i_contribuintes",referencedColumnName = "ID")
    private Contribuinte contribuinte;

    @NotNull
    @ManyToOne
    @JoinColumn(name="i_lista_servicos",referencedColumnName = "ID")
    private ListaServicos listaServicos;


    @NotNull
    @ManyToOne
    @JoinColumn(name="i_empresas",referencedColumnName = "ID")
    private Empresa empresa;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public ListaServicos getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(ListaServicos listaServicos) {
        this.listaServicos = listaServicos;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public Double getQtdServico() {
        return qtdServico;
    }

    public void setQtdServico(Double qtdServico) {
        this.qtdServico = qtdServico;
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
}
