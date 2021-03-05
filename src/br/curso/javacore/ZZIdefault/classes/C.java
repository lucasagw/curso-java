package br.curso.javacore.ZZIdefault.classes;

import br.curso.javacore.ZZIdefault.interfaces.A;
import br.curso.javacore.ZZIdefault.interfaces.B;

public class C implements A, B {  //extends D

    public static void main(String[] args) {
        new C().oi();

    }

    public void oi() { // 3 regra
        A.super.oi();
        B.super.oi();
    }


}