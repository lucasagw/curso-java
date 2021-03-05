package br.curso.javacore.ZZKstreams.test;

import br.curso.javacore.ZZKstreams.classes.Pessoa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StreamTest6Collectors1 {
// Redução e sumarização de streams em um valor único
// Agrupamento de elementos
// Particionamento de elementos

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(Collectors.counting()));


        Optional<Pessoa> max = pessoas.stream().max(Comparator.comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());

        Optional<Pessoa> min = pessoas.stream().min(Comparator.comparing(Pessoa::getSalario));
        System.out.println(min.get().getSalario());

        Optional<Pessoa> collect = pessoas.stream().collect(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());

        Optional<Pessoa> collect1 = pessoas.stream().collect(Collectors.minBy(Comparator.comparing(Pessoa::getSalario)));
        System.out.println(collect1.get().getSalario());

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());

        System.out.println(pessoas.stream().collect(Collectors.summingDouble(Pessoa::getSalario)));

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());

        System.out.println(pessoas.stream().collect(Collectors.averagingDouble(Pessoa::getSalario)));

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).min()); //max
        OptionalDouble min1 = pessoas.stream().mapToDouble(Pessoa::getSalario).min();
        System.out.println(min1.getAsDouble());

        DoubleSummaryStatistics collect2 = pessoas.stream().collect(Collectors.summarizingDouble(Pessoa::getSalario));
        System.out.println(collect2);

        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(Collectors.joining(", ")));


    }


}
