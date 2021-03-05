package br.curso.javacore.Zcolecoes.test;

import br.curso.javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>(); //LinkedList

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0,0);
        Produto produto2 = new Produto("321", "Picanha", 26.4,10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0,5);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.5,0);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext(); //next();
        while(produtoIterator.hasNext()) { //tem um proximo? aponte
            Produto produto = produtoIterator.next(); //pegue!
            if (produto.getQuantidade() == 0) { //  if ( produtoIterator.next().getQuantidade() == 0)
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
 }
