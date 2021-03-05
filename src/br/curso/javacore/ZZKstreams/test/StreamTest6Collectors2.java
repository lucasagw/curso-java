package br.curso.javacore.ZZKstreams.test;

import br.curso.javacore.ZZKstreams.classes.Genero;
import br.curso.javacore.ZZKstreams.classes.Maioridade;
import br.curso.javacore.ZZKstreams.classes.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest6Collectors2 {
    // Agrupamento
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

        Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();

        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getGenero().equals(Genero.FEMININO)) {
                femininos.add(pessoa);
            } else {
                masculinos.add(pessoa);
            }
        }
        generoListMap.put(Genero.FEMININO, femininos);
        generoListMap.put(Genero.MASCULINO, masculinos);
        System.out.println(generoListMap);

        //Agrupando por genero
        Map<Genero, List<Pessoa>> collect = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero));
        System.out.println(collect);

        //Agrupar por maioridade
        Map<Maioridade, List<Pessoa>> collect1 = pessoas.stream()
                .collect(groupingBy(p -> {
                    if (p.getIdade() < 18) return Maioridade.MENOR;
                    else return Maioridade.ADULTO;
                }));
        System.out.println(collect1);

        //Agrupando por genero e maioridade
        // Map<Gereno, Map<Maioridade, List<Pessoa>>>
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, groupingBy(p -> {
                    if (p.getIdade() < 18) return Maioridade.MENOR;
                    else return Maioridade.ADULTO;
                })));
        System.out.println(collect2);

        //Agrupando por genero contando a quantidade de pessoas em cada genero
        Map<Genero, Long> collect3 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.counting()));
        System.out.println(collect3);

        //Agrupar por genero e maior salario com optional
        Map<Genero, Optional<Pessoa>> collect4 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))));
        System.out.println(collect4);

        //Agrupar por genero e maior salario sem optional
        Map<Genero, Pessoa> collect5 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero,
                        collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)), Optional::get)));
        System.out.println(collect5);

        //Agrupando por genero e estatisticas
        Map<Genero, DoubleSummaryStatistics> collect6 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, summarizingDouble(Pessoa::getSalario)));
        System.out.println(collect6);

        //Agrupando por genero e verificar menor e maior de idade
        Map<Genero, List<Maioridade>> collect7 = pessoas.stream().collect(groupingBy(Pessoa::getGenero,
                mapping(p -> {
                    if (p.getIdade() < 18) return Maioridade.MENOR;
                    else return Maioridade.ADULTO;
                }, toList())));
        System.out.println(collect7);

        Map<Genero, Set<Maioridade>> collect8 = pessoas.stream().collect(groupingBy(Pessoa::getGenero,
                mapping(p -> {
                    if (p.getIdade() < 18) return Maioridade.MENOR;
                    else return Maioridade.ADULTO;
                }, toSet())));
        System.out.println(collect8);

        Map<Genero, Set<Maioridade>> collect9 = pessoas.stream().collect(groupingBy(Pessoa::getGenero,
                mapping(p -> {
                    if (p.getIdade() < 18) return Maioridade.MENOR;
                    else return Maioridade.ADULTO;
                }, toCollection(LinkedHashSet::new))));
        System.out.println(collect9);


    }

}


