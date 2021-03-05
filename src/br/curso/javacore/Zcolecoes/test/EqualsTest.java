package br.curso.javacore.Zcolecoes.test;

import br.curso.javacore.Zcolecoes.classes.Celular;

public class EqualsTest {
    public static void main(String[] args) {
          String nome1 = "Lucas Augusto";
          String nome2 = new String ("Lucas Augusto");
          System.out.println(nome1 == nome2);
        System.out.println("equals: " + nome1.equals(nome2));
          Integer int1 = 5;
          Integer int2 = new Integer(5);
          System.out.println(int1 == int2);
        System.out.println("equals: " + int1.equals(int2));


        Celular c1 = new Celular("iPhone", "1234");

        Celular c2 = new Celular("iPhone", "1234");
        System.out.println(c1.equals(c2));

    }




}
