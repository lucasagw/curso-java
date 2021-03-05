package br.curso.javacore.ZZHlambdas.test;

import br.curso.javacore.ZZHlambdas.classes.Carro;
import br.curso.javacore.ZZHlambdas.classes.ComparadorCarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class LambdaTest3 {

    //LAMBDA COM METHOD REFERENCES
    public static void main(String[] args) {
        forEach(asList("William", "Devdojo", "facebook.com/devdojobr"), System.out::println);

        List<Carro> carros = asList(new Carro("Vermelho", 1999), new Carro("Azul", 2005), new Carro("Preto", 1985));

        //Reference to a static method
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);

        //Reference to an instance method of a particular object
        ComparadorCarro comparadorCarro = new ComparadorCarro();

//        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new; //Reference to a constructor
//        Collections.sort(carros, comparadorCarroSupplier.get()::comparePorAno);

        Collections.sort(carros, comparadorCarro::comparePorAno);
        System.out.println(carros);

        //Reference to an instance method of an arbitrary object of a particular type
        List<String> nomes = asList("Wiiliam", "DevDojo", "Anna", "Brenon");
        //  nomes.sort((s1, s2) -> s2.compareTo(s1)); //somente com lambda consigo mudar a ordenação
        nomes.sort(String::compareTo); //entrega a forma padrao, n posso alterar
        System.out.println(nomes);

//        Function<String, Integer> stringToFunction = s -> Integer.parseInt(s);
        Function<String, Integer> stringToFunction2 = Integer::parseInt;
        System.out.println(stringToFunction2.apply("10"));

//        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(contains2.test(nomes, "Anna"));

        //Reference to a constructor
//        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
//        System.out.println(comparadorCarroSupplier.get());

        //      BiFunction<String, Integer, Carro> carroBiFunction = (s, i) -> new Carro(s, i);
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction2.apply("rosa", 1994));


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



