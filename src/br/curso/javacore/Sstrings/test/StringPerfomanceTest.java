package br.curso.javacore.Sstrings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuildder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: " + (fim - inicio) + "ms");
    }

    public static void concatString(int tam) {
        String string = " ";
        for (int i = 0; i < tam; i++) {
            string += i;
        }

    }

    public static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }

    }

    public static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }

    }


}