package br.curso.javacore.Isobrescrita.classes;

public class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
