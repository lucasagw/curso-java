package br.curso.javacore.ZZFpadroesdeprojeto.test;

import br.curso.javacore.ZZFpadroesdeprojeto.classes.Moeda;
import br.curso.javacore.ZZFpadroesdeprojeto.classes.MoedaFactory;
import br.curso.javacore.ZZFpadroesdeprojeto.classes.PaísEnum;

import javax.xml.bind.SchemaOutputResolver;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(PaísEnum.BRASIL);
        System.out.println(moeda.getSimbolo());

        moeda = MoedaFactory.criarMoeda(PaísEnum.EUA);
        System.out.println(moeda.getSimbolo());

    }


}
