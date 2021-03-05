package br.curso.javacore.ZZFpadroesdeprojeto.test;

import br.curso.javacore.ZZFpadroesdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }

}
