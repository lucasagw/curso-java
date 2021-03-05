package br.curso.javacore.ZZMcompletablefuture.classes;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;

public class NovaLoja {
    private String nome;


    public NovaLoja() {

    }


    public NovaLoja(String nome) {
        this.nome = nome;
    }


    // NomeDaLoja:Preco:CodigoDeDesconto
    public String getPreco() { //síncrono
        Locale.setDefault(Locale.US);
        double preco = calcularPreco();
        Desconto.Codigo codigo = Desconto.Codigo.values()[
                ThreadLocalRandom.current().nextInt(Desconto.Codigo.values().length)];
        return String.format("%s:%.2f:%s", nome, preco, codigo);

    }

//    public Future<Double> getPrecoAsync() { //assíncrono
//        CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
//        new Thread(() -> {
//            try {
//                precoFuturo.complete(calcularPreco());
//            } catch ( Exception e ) {
//                precoFuturo.completeExceptionally(e);
//            }
//        }).start();
//        return precoFuturo;
//    }

//    public Future<Double> getPrecoAsyncTunado() { //assíncrono
//        return CompletableFuture.supplyAsync(this::calcularPreco);
//
//    }


    private double calcularPreco() {
        delay();
//        System.out.println(1 / 0);
        return ThreadLocalRandom.current().nextDouble() * 100;

    }

    private static void delay() {
        try {
            int delay = ThreadLocalRandom.current().nextInt(500, 2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<NovaLoja> lojas() {
        return asList(
                new NovaLoja("americanas"),
                new NovaLoja("casas bahia"),
                new NovaLoja("bestbuy"),
                new NovaLoja("amazon"));


    }
}