package br.curso.javacore.ZZHlambdas.test;


import br.curso.javacore.ZZHlambdas.classes.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;


public class LambdaTest2 {
    public static void main(String[] args) {
        forEach(asList("William", "Devdojo", "facebook.com/devdojobr"), (String s) -> System.out.println(s));

        List<Integer> list = map(asList("William", "Devdojo", "facebook.com/devdojobr"), (String s) -> s.length());

        List<Carro> carros = asList(new Carro("Preto", 2011), new Carro("Preto", 2011), new Carro("Preto", 2011));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(listCores);
        System.out.println(list);

        Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
        System.out.println(pares.test(1000));
        IntPredicate ímpar = (int i) -> i % 2 == 1; // suporte a dados primitivos
        System.out.println(ímpar.test(1000));

//        Callable<Integer> c = () -> 100;
//        PrivilegedAction<Integer> p = () -> 100;


        Predicate<String> p = (String s) -> listCores.add(s);
        System.out.println(p.test("amarelo"));
        System.out.println(listCores);

        String cor = "vermelho"; // variavel local é efetivamente final. regra tbm para classe anonima.
        Consumer<String> b = s -> listCores.add(cor);
        b.accept("AMARELO");
        System.out.println(listCores);

        Supplier<String> SUP1 = () -> "OI";
        System.out.println(SUP1.get());

        Supplier<Carro> sup2 = () -> new Carro("Verde", 2011);
        System.out.println(sup2.get());
        System.out.println(sup2.get().getAno());

        Supplier<List> sup3 = () -> carros;
        System.out.println(sup3.get());

        Carro c1 = new Carro("azul", 2005);
        Supplier<Carro> sup4 = () ->  c1;
        System.out.println(sup4.get());
    }


    public static <T> void forEach(List<T> list, Consumer<T> c) { // generico
        for (T e : list) {
            c.accept(e); // aceitando a lista

        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) { // generico
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }

}

