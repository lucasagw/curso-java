package br.curso.javacore.ZZKstreams.test;

import br.curso.javacore.ZZKstreams.classes.Pessoa;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        //Esses métodos vão retornar true se e somente se:
        //anyMatch  -> Se haver alguém na lista que retorna true;
        //allMatch    -> Se todo mundo na lista retorna true;
        //noneMatch -> Se todos na lista retornam false;

        System.out.println(pessoas.stream().anyMatch(p -> p.getSalario() > 4000));
        System.out.println(pessoas.stream().allMatch(p -> p.getIdade() > 18));
        System.out.println(pessoas.stream().noneMatch(p -> p.getIdade() < 18));

        pessoas.stream()
                .filter(p -> p.getIdade() < 25)
                .findAny()
                .ifPresent(p -> System.out.println(p.getNome()));

        pessoas.stream()
                .filter(p -> p.getIdade() > 30)
                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .findFirst() //pega quem está no topo
                .ifPresent(p -> System.out.println(p.getNome()));


        Optional<Pessoa> any = pessoas.stream()
                .filter(p -> p.getIdade() < 25)
                .findAny();
        System.out.println(any.get());

    }


}
