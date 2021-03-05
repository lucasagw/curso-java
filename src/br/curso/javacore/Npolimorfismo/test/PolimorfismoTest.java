package br.curso.javacore.Npolimorfismo.test;

import br.curso.javacore.Npolimorfismo.classes.Gerente;
import br.curso.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.curso.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Osvaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
        //  relatorio.relatorioPagamentoGerente(g);
        //  System.out.println("---------------------------");
        //  relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);

        System.out.println("---------------------------");

        relatorio.relatorioPagamentoGenerico(v);


    }
}
