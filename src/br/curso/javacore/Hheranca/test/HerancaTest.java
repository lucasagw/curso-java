package br.curso.javacore.Hheranca.test;

import br.curso.javacore.Hheranca.classes.Endereco;
import br.curso.javacore.Hheranca.classes.Funcionario;
import br.curso.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gina");

        p.setCpf("12345");

        Endereco end = new Endereco();
        end.setBairro("Bairro 1");
        end.setRua("Rua 21");

        p.setEndereço(end);
        p.print();
        System.out.println("-------------------------");
        Funcionario f = new Funcionario("Augusto");

        f.setCpf("061.397.725-40");
        f.setSalario(15000);
        f.setEndereço(end);
        f.print();


    }
}
