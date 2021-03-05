package br.curso.javacore.ZZKstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest2 {

    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>(); //matriz
        nomes.add(asList("DevDaojo", "Valeu por aumentar a letra"));
        nomes.add(asList("William", "pq vc demorou 180 aulas pra isso"));
        //  Stream<List<String>> stream = nomes.stream();
        //  Stream<String> stringStream = nomes.stream().flatMap(Collection::stream);
        // o flatmap é utilizado quando se tem um valor dentro de outro, e o objetivo é extrair esses valores
        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);

        List<String> palavras = asList("Ola", "Goku");
        String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));

        //  Stream<String[]> stream = palavras.stream().map(p -> p.split(""));
        //  List<String[]> collect1 = palavras.stream().map(p -> p.split("")).collect(Collectors.toList());
        //  Stream<Object> stream = Arrays.stream(palavras.toArray());
        //   Stream<String> stream = Arrays.stream((String[]) palavras.toArray()); //transformando um array em um Stream de String.


        //Se encontrar o valor que estou precisando, basta usar o map. Se  precisar extrair de algo para encontrar o resultado, uso o flatmap.
        List<String> collect2 = palavras.stream()
                .map(p -> p.split("")) // Stream<String[]> trabalhando com os valores individuais
                .flatMap(Arrays::stream) // Stream<String> extraindo valores de algum lugar
                .collect(Collectors.toList());
        System.out.println(collect2);


    }

}
