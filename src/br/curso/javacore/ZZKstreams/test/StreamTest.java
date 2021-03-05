package br.curso.javacore.ZZKstreams.test;

import br.curso.javacore.ZZKstreams.classes.Pessoa;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    //Pegar os três primeiros nomes das pessoas com menos de 25 anos
    // Ordenados pelo nome
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));

        List<String> nomes = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 25) {
                nomes.add(pessoa.getNome());
                if (nomes.size() >= 3)
                    break;
            }

        }
        //   System.out.println(nomes);

        //Intermediate e Terminal
        List<String> nomes2 = pessoas.stream() //em tempo real
                .filter(pIdade -> pIdade.getIdade() < 25)  // filtro
                .sorted(Comparator.comparing(Pessoa::getNome)) // ordenação por nome
                .limit(3) //limita os dados
                .skip(1) //pula o dado
                .map(Pessoa::getNome)//retorna o resultado final
                .collect(Collectors.toList()); //transforma o resultado em uma lista de coleção
        // terminal
        System.out.println(nomes2);

        System.out.println(pessoas
                .stream()
                .distinct()
                .filter(pIdade -> pIdade.getIdade() < 25)
                .map(Pessoa::getNome)
                .count());  // Terminal

        pessoas.stream().forEach(System.out::println); // Terminal

    }


}
