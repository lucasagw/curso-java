package br.curso.javacore.ZZFpadroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
    // EAGER INITIALIZATION
//    private static final AviaoSingleton INSTANCE = new AviaoSingleton();
    private static AviaoSingleton INSTANCE;

    private Set<String> assentosDisponiveis;

    // LAZY INITIALIZATION > SÓ CRIA O OBJETO QUANDO REALMENTE FOR UTILIZADO.
    public static AviaoSingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AviaoSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AviaoSingleton();

                }
            }

        }

        return INSTANCE;
    }

    private AviaoSingleton() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");


    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);

    }


}
