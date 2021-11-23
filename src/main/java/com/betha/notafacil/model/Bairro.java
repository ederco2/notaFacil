package com.betha.notafacil.model;

import com.betha.notafacil.enterprise.AbstractRegion;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Bairro extends AbstractRegion {
    @NotNull(message = "Bairro nao pode ser nulo!")
    @ManyToOne
    @JoinColumn(name="i_cidades",referencedColumnName = "ID")
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
