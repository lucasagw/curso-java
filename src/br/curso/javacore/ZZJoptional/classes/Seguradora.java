package br.curso.javacore.ZZJoptional.classes;

import java.util.Optional;

public class Seguradora {

    String nome;

    public Seguradora(String nome) {
        this.nome = nome;
    }

    public Seguradora() {

    }


    @Override
    public String toString() {
        return "Seguradora{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


