package com.betha.notafacil.enterprise;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractRegion extends AbstractEntity{
    @Column(name="NOME")
    private String nome;

    @Column(name="POPULACAO")
    private String populacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
                "nome='" + nome + '\'' +
                ", populacao='" + populacao + '\'' +
                '}';
    }
}
