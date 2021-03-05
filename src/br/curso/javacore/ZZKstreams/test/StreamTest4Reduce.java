package br.curso.javacore.ZZKstreams.test;

import br.curso.javacore.ZZKstreams.classes.Pessoa;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest4Reduce {
    public static void main(String[] args) {

        Optional<Integer> soma = getStream().reduce((x, y) -> x + y);
        System.out.println(soma.get());


        Integer soma1 = getStream().reduce(0, (x, y) -> x + y);
        System.out.println(soma1);


        Optional<Integer> soma2 = getStream().reduce(Integer::sum);
        //  Integer soma22 = getStream().reduce(0, Integer::sum);
        System.out.println(soma2.get());

        Optional<Integer> mult = getStream().reduce((x, y) -> x * y);
        System.out.println(mult.get());

        Integer mult2 = getStream().reduce(1, (x, y) -> x * y);
        System.out.println(mult2);

        Optional<Integer> maxNum = getStream().reduce((x, y) -> x > y ? x : y);
        System.out.println(maxNum.get());

        Optional<Integer> maxNum1 = getStream().reduce(Integer::max);
        System.out.println(maxNum1.get());


        Stream<Pessoa> streamPessoa = Pessoa.bancoDePessoas().stream();

        Optional<Double> somaSalario = streamPessoa.filter(p -> p.getSalario() > 4000)
                .map(Pessoa::getSalario)
                .reduce(Double::sum);//causa impacto de perfomance
        System.out.println(somaSalario.get());

        //Stream especializado em tipos primitivos
        streamPessoa = Pessoa.bancoDePessoas().stream();
        double sum = streamPessoa.filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario) ////tem suporte a max, min, sum, average...
                .sum();
        System.out.println(sum);

        DoubleStream doubleStream = Pessoa.bancoDePessoas().stream().filter(p -> p.getSalario() > 4000)
                .mapToDouble(Pessoa::getSalario); //tem suporte a max, min, sum, average...
        Stream<Double> doubleStream1 = doubleStream.boxed();


    }

    private static Stream<Integer> getStream() {
        return asList(1, 2, 3, 4, 5, 6).stream();
    }
}
