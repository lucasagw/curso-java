package br.curso.javacore.Sstrings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Lucas";
        nome = nome.concat(" Augusto"); //nome+= " Augusto";
        System.out.println(nome);

        String teste = "Goku";
        System.out.println(teste.charAt(3));

        String teste2 = "   0123456789   ";
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace("o", "a"));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,2)); //atenção !
        System.out.println(teste2.trim()); //remove espaços em branco inicio e fim.
    }
}
