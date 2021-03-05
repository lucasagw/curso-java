package br.curso.javacore.Wio.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) { //isso só funciona no terminal do windows. importante saber que readLine usa String e readPassword ArrayChar por ser mais seguro.
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
        for (char pass : pw) {
            c.format("%c ", pass);
        }
        c.format("\n");
        String texto;
        while (true) {
            texto = c.readLine("%s", "Digite: ");
            c.format("esse texto %s foi digitado ", retorno(texto));
        }

    }

    public static String retorno(String arg1) {
        return arg1;
    }
}
  // continuar da  Aula 103: NIO pt 01 Introdução as novas classes Path, Paths, Files