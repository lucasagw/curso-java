package br.curso.javacore.ZZHlambdas.interfaces;


import br.curso.javacore.ZZHlambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate { // interface que está limitada a apenas 1 método abstrato.
    boolean test(Carro carro);
    // (parametro) -> <expressao>
    // (Carro carro) -> carro.getCor().equals("verde");

}
