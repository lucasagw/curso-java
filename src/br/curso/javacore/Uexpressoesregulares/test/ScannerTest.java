package br.curso.javacore.Uexpressoesregulares.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi");
        while (scanner.hasNext()) { //verifica se existe uma proxima posição.
            System.out.println(scanner.next()); //pega e muda o indice.
        }
        System.out.println("###################");
        Scanner scanner2 = new Scanner("1 true 100 oi");
        while (scanner2.hasNext()) {
            if (scanner2.hasNextInt()) {
                int i = scanner2.nextInt();
                System.out.println("int: " + i);
            } else if (scanner2.hasNextBoolean()) {
                boolean b = scanner2.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println("String: " + scanner2.next());
            }
        }
    }
}
