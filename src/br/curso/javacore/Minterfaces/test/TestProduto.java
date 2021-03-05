package br.curso.javacore.Minterfaces.test;

import br.curso.javacore.Minterfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);

        p.calculaImposto();
        p.calculaFrete();

        System.out.println(p);

   //continuar da Aula 64: Polimorfismo pt 01

    }


}
