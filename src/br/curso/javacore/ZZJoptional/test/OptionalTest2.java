package br.curso.javacore.ZZJoptional.test;


import br.curso.javacore.ZZJoptional.classes.Carro;
import br.curso.javacore.ZZJoptional.classes.Pessoa;
import br.curso.javacore.ZZJoptional.classes.Seguradora;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("DevDojo Seguros");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa p = new Pessoa(carro, "Carlos");
        p.setIdade(20);

        System.out.println(obterNomeSeguradora(Optional.ofNullable(p)));

        checarNomeSeguradora(seguradora);
        checarNomeSeguradoraOptional(seguradora);


        System.out.println(obterNomeSeguradoraComIdade(p, 18));

        Map<String, String> map = new HashMap<>();
        System.out.println(Optional.ofNullable(map.get("kkkk")));


        System.out.println(stringToInt("A"));
    }

    /***
     *
     * @param numero
     * @return
     */
    private static Optional<Integer> stringToInt(String numero) {
        try {
            return Optional.of(Integer.parseInt(numero));
        } catch ( NumberFormatException e ) {
            //  e.printStackTrace();
            return Optional.empty();
        }


    }


    private static void checarNomeSeguradora(Seguradora seguradora) {
        if (seguradora != null && seguradora.getNome().equals("DevDojo Seguros")) {
            System.out.println("é o devdojo");
        }

    }

    private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
        Optional.ofNullable(seguradora) //filter verifica se existe algo dentro do objeto e trabalha
                .filter(s -> s.getNome().equals("DevDojo Seguros"))    //com o predicat epara realizar alguma necessidade.
                .ifPresent(x -> System.out.println("é o devdojo")); //pra saber se o valor realmente existe
        //como se o Consumer tivesse dentro de um if, será executado apenas se for true.
    }

    private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
        return Optional.ofNullable(p).filter(pessoa -> pessoa.getIdade() >= idadeMinima)  //como se fosse um if,
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora ou a idade mínima não foi atingida!!");

    }


    public static String obterNomeSeguradora(Optional<Pessoa> p) {
        return p.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora) //flatmap para retornar um optional
                .map(Seguradora::getNome) // map retorna o resultado final
                .orElse("Não existe seguradora.");


    }


}