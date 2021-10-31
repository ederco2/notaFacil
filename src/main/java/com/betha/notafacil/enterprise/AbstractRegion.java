package com.betha.notafacil.enterprise;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class AbstractRegion extends AbstractEntity{
    @NotNull(message = "O Nome não pode ser nulo!")
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
