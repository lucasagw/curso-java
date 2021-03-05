package br.curso.javacore.ZZGcomportamentoporparametro.predicate;

import br.curso.javacore.ZZGcomportamentoporparametro.classes.Carro;
import br.curso.javacore.ZZGcomportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {


    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
