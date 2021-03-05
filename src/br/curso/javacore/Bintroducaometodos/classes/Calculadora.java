package br.curso.javacore.Bintroducaometodos.classes;

public class Calculadora {

    static public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    static public void subtraiDoisNumeros() {
        System.out.println(5 - 5);

    }

    static public void multiplicarDoisNumeros(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    static public double diviDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;  // usando o cast pra forçar ser int.
        }
        return 0;
    }

    static public void imprimirDoisNumerosDiv(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; //o return só pode ser assim em metodo void. ele encerra a execução e volta pra quem chamou o metodo.
            // funciona como break.
        }
        System.out.println("Não é possível dividir por zero.");
    }

    static public void altrarDoisValores(int a, int b) {
        a = 30;
        b = 40;

        System.out.println("num1: " + a);
        System.out.println("num1: " + b);

    }

    static public void somaArrays(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    static public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}