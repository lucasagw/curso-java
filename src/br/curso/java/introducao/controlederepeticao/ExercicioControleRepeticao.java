package br.curso.java.introducao.controlederepeticao;

public class ExercicioControleRepeticao {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 100.000
        int contador = 10;

        for (int i = 0; i <= contador; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}