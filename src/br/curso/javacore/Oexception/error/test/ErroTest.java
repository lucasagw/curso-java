package br.curso.javacore.Oexception.error.test;

public class ErroTest {
    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError() {
        stackOverflowError();
    }
}
