package com.betha.notafacil.enterprise;

public class AbstractRegion extends AbstractEntity{
    private String name;
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
