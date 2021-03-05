package br.curso.javacore.ZZFpadroesdeprojeto.test;

import br.curso.javacore.ZZFpadroesdeprojeto.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("William").
                nomeDoMeiom("Suane").
                ultimoNome("Queiroz").
                nomeDoPai("Will").
                apelido("Jiraya Bolado").build();

        System.out.println(p);
    }

}
