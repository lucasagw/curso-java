package br.curso.javacore.Bintroducaometodos.classes.introducaometodos.test;

import br.curso.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); //nao precisa disso mais pq foi transformado tudo em static, pois n esta usando atributo de classe.

        System.out.println("soma");
        Calculadora.somaDoisNumeros();

        System.out.println("");

        System.out.println("subtração");
        Calculadora.subtraiDoisNumeros();

        System.out.println("");
        System.out.println("Multiplicação");
        Calculadora.multiplicarDoisNumeros(5.5, 2);

        System.out.println("");
        System.out.println("divisão");
        double result = Calculadora.diviDoisNumeros(2, 0);
        System.out.println(result);

        System.out.println("");

        System.out.println("Imprimindo dois valores dividindo");
        Calculadora.imprimirDoisNumerosDiv(3, 0);

        System.out.println("");

        int a = 50;
        int b = 60;
        Calculadora.altrarDoisValores(a, b);
        System.out.println(a);
        System.out.println(b);

        System.out.println("");

        int[] numero = {1, 2, 3, 4, 5};
        Calculadora.somaArrays(numero);

        Calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }

}
