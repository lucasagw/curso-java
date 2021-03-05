package br.curso.javacore.ZZFpadroesdeprojeto.classes;

public class MoedaFactory {

    public static Moeda criarMoeda(PaísEnum país) {
        if (país.equals(PaísEnum.BRASIL)) {
            return new Real();
        } else if (país.equals(PaísEnum.EUA)) {
            return new USDolar();
        }
        throw new IllegalArgumentException("Não existe esse país");

    }


}
