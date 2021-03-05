package br.curso.javacore.Csobrecargametodos.test;

import br.curso.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Lucas", "061.397.725-40", 4500, "657254-20");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("augusto");


        // metodo de inicialização funcionario.init("Chica da Silva", "061.397.725-40", 4500, "657254-20");

        funcionario.imprime();
        funcionario2.imprime();


    }
}
