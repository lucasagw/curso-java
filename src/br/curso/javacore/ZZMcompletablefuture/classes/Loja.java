package br.curso.javacore.ZZMcompletablefuture.classes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {
    private String nome;


    public Loja() {
    }

    public Loja(String nome) {
        this.nome = nome;
    }

    public double getPreco() { //síncrono
        //Vai pegar o preço aonde judas perdeu as botas
        return calcularPreco();

    }

    public Future<Double> getPrecoAsync() { //assíncrono
        CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
        new Thread(() -> {
            try {
                precoFuturo.complete(calcularPreco());
            } catch ( Exception e ) {
                precoFuturo.completeExceptionally(e);
            }
        }).start();
        return precoFuturo;
    }

    public Future<Double> getPrecoAsyncTunado() { //assíncrono
        return CompletableFuture.supplyAsync(this::calcularPreco);

    }


    private double calcularPreco() {
        delay();
//        System.out.println(1 / 0);
        return ThreadLocalRandom.current().nextDouble() * 100;

    }

    private static void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
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
}
