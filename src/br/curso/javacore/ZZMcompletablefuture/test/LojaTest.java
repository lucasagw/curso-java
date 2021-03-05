package br.curso.javacore.ZZMcompletablefuture.test;

import br.curso.javacore.ZZMcompletablefuture.classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class LojaTest {
    public static void main(String[] args) {
        Loja amercianas = new Loja();
        Loja casasBahia = new Loja();
        Loja bestBuy = new Loja();
        Loja wallmart = new Loja();

//        long start = System.currentTimeMillis(); síncrona
//        System.out.println(amercianas.getPreco());
//        System.out.println(casasBahia.getPreco());
//        System.out.println(bestBuy.getPreco());
//        System.out.println(wallmart.getPreco());
//        System.out.println(System.currentTimeMillis() - start + " ms");

//        long start = System.currentTimeMillis(); //assíncrona
//        Future<Double> precoAsync = amercianas.getPrecoAsync();
//        Future<Double> precoAsync1 = casasBahia.getPrecoAsync();
//        Future<Double> precoAsync2 = bestBuy.getPrecoAsync();
//        Future<Double> precoAsync3 = wallmart.getPrecoAsync();
//        long end = System.currentTimeMillis();
//        System.out.println("Tempo de invocação: " + (end - start) + " ms");
//        enrolando();

        long start = System.currentTimeMillis(); //assíncrona
        Future<Double> precoAsync = amercianas.getPrecoAsyncTunado();
        Future<Double> precoAsync1 = casasBahia.getPrecoAsyncTunado();
        Future<Double> precoAsync2 = bestBuy.getPrecoAsyncTunado();
        Future<Double> precoAsync3 = wallmart.getPrecoAsyncTunado();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de invocação: " + (end - start) + " ms");
        enrolando();


        try {
            //  System.out.println(" ****: " + precoAsync.get(3, TimeUnit.SECONDS));
            System.out.println("Americanas: " + precoAsync.get());
            System.out.println("Casas Bahia: " + precoAsync1.get());
            System.out.println("Best Buy: " + precoAsync2.get());
            System.out.println("Wallmart: " + precoAsync3.get());
        } catch ( InterruptedException | ExecutionException e ) {
            e.printStackTrace();
        }
        System.out.println("Tempoo que levou para pegar o resultado: " + (System.currentTimeMillis() - start) + " ms");

    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);

    }

}
