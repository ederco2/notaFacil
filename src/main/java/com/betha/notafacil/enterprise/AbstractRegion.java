package com.betha.notafacil.enterprise;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractRegion extends AbstractEntity{
    @Column(name="NOME")
    private String name;

    @Column(name="POPULACAO")
    private String populacao;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "AbstractRegion{" +
                "name='" + name + '\'' +
                ", populacao='" + populacao + '\'' +
                '}';
    }
}
