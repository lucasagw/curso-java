package br.curso.javacore.Isobrescrita.test;

import br.curso.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina na esquina");
        p.setIdade(300);

        System.out.println(p.toString());

        Pessoa p2 = new Pessoa();
        p2.setNome("Augusto");
        p2.setIdade(24);
        System.out.println(p2);
    }
}
