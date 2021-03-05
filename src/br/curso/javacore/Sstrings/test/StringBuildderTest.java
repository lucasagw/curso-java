package br.curso.javacore.Sstrings.test;

public class StringBuildderTest {  //StringBuffer
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16); //não é uma String
        sb.append("mumoc esarf amU");
        System.out.println(sb.insert(2, "####")); //varias opções
    }
}
