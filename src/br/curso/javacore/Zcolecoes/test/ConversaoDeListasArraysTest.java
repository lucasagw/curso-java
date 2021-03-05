package br.curso.javacore.Zcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArraysTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Integer[] numerosArrays = new Integer[numeros.size()];
         numeros.toArray(numerosArrays);
        System.out.println(numeros);
        System.out.println(Arrays.toString(numerosArrays));

        System.out.println("------------------------");
        Integer[] numerosArrays2 = new Integer[4];
        numerosArrays2[0] = 10;
        numerosArrays2[1] = 9;
        numerosArrays2[2] = 8;
        numerosArrays2[3] = 7;

        List<Integer> numeros2 = Arrays.asList(numerosArrays2);

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(Arrays.asList(numerosArrays2));

        numeros2.set(0, 1);
        numeros3.add(10);
        System.out.println(Arrays.toString(numerosArrays2));
        System.out.println(numeros2);
        System.out.println(numeros3);


    }
}
