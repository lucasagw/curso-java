package br.curso.javacore.Zcolecoes.test;

import br.curso.javacore.Zcolecoes.classes.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0,0);
        Produto produto2 = new Produto("321", "Picanha", 26.4,10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0,5);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.5,0);
        Produto produto5 = new Produto("012", "Samsung Galaxy S6 64Gb", 3200.5, 0);

        Set<Produto> produtosSet = new HashSet<>(); //não possui indíce/get e não permite duplicação de dados.
        produtosSet.add(produto1);                  //não tem uma ordem definida de impressão.
        produtosSet.add(produto2);                  //para ter uma ordem por inserção basta usar o LinkedHashSet.
        produtosSet.add(produto3);
        produtosSet.add(produto4);
        produtosSet.add(produto5);

        for (Produto produtos : produtosSet) {
            System.out.println(produtos);
        }
    }
}
              //continuar da Aula 127: Coleções pt 12 NavigableSet e TreeSet