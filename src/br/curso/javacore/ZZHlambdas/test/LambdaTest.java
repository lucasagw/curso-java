package br.curso.javacore.ZZHlambdas.test;

import br.curso.javacore.ZZHlambdas.classes.Carro;
import br.curso.javacore.ZZHlambdas.interfaces.CarroPredicate;

import java.util.function.Predicate;

public class LambdaTest {
    // anonima // function // passada por aí - como argumento de método ou guardar numa variavel.
    // concisa - consegue resolver uma coisa em apenas 1 linha.
    // (Carro carro) -> carro.getCor().equals("verde");
    // (String s) -> s.length()
    // (int a, int b) -> {sout(a + b)}
    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() { // classe anonima
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };

        //assinatura do método vai ser responsável pela assinatura da lambda. A assinatura do método determina como a lambda será escrita.
        Predicate<Carro> carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        System.out.println(carroPredicate2.test(new Carro("verde", 2012)));

        System.out.println(carroPredicate.test(new Carro("verde", 2012)));

        Runnable runnable = () -> System.out.println("Dentro do run");
        //runnable.run();
        new Thread(runnable).start();

    }
}
