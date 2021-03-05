package br.curso.javacore.ZZIdefault.classes;

import br.curso.javacore.ZZIdefault.interfaces.A;

public class D implements A {
                         // 1 regra
    public void oi() {  // método sobrescrito na classe tem vantagem sobre método default de interface
        System.out.println("Dentro do oi de A na classe D");
    }

}
