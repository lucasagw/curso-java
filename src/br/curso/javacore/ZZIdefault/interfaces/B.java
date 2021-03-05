package br.curso.javacore.ZZIdefault.interfaces;

public interface B  {  // extends A

    default void oi(){                           // 2 regra
        System.out.println("Dentro do oi de B"); //B MAIS ESPECIFICO QUE A
    }


}
