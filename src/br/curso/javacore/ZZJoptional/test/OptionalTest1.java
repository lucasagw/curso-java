package br.curso.javacore.ZZJoptional.test;

import java.util.Optional;

public class OptionalTest1 {
    private String nome;

    public static void main(String[] args) {
        OptionalTest1 ot = new OptionalTest1();
        Optional<String> optional1 = Optional.of("DevDojo"); // certeza q n vai ser nulo
        Optional<String> optional2 = Optional.empty(); // certeza que vai ser vazio
        Optional<String> optional3 = Optional.ofNullable(ot.nome); // incerteza, existe a possibilidade de ser null

        //Imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);

        // Buscando valores
//        System.out.println(optional1.get());
////        if (optional2.isPresent())
////            System.out.println(optional2.get());
        System.out.println(optional1.orElse("vazio"));
        System.out.println(optional2.orElse("vazio"));
        System.out.println(optional3.orElse("vazio"));

    }

}
