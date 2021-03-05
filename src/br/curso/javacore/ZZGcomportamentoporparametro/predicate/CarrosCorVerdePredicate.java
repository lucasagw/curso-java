package br.curso.javacore.ZZGcomportamentoporparametro.predicate;

import br.curso.javacore.ZZGcomportamentoporparametro.classes.Carro;
import br.curso.javacore.ZZGcomportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
