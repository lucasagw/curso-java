package br.curso.javacore.Lclassesabstratas.test;

import br.curso.javacore.Lclassesabstratas.classes.Gerente;
import br.curso.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", "2012-2", 2000);
        Vendedor v = new Vendedor("Camilla", "22211-4", 1500, 5000);

        g.calcularSalario();
        v.calcularSalario();

        System.out.println(g);
        System.out.println("----------");
        System.out.println(v);


    }

}
