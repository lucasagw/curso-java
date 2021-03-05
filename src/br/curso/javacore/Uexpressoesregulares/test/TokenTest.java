package br.curso.javacore.Uexpressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "William, Paulo, Joana, Camila, John, Matheus";
        String[] tokens = str.split(",");//posso usar expressao regular como delimitadores
        for (String arr : tokens) {
            System.out.println(arr.trim());
        }
    }
}

