package br.curso.javacore.ZZMcompletablefuture.test;

import br.curso.javacore.ZZMcompletablefuture.classes.Desconto;
import br.curso.javacore.ZZMcompletablefuture.classes.NovaLoja;
import br.curso.javacore.ZZMcompletablefuture.classes.Orcamento;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NovaLojaTest {
    public static void main(String[] args) {
        List<NovaLoja> lojas = NovaLoja.lojas();
        //  lojas.stream().forEach(novaLoja -> System.out.println(novaLoja.getPreco()));
        // acharPrecos(lojas);

        final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 100), r -> { //new threadFactory
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });

        //acharPrecosAsync(lojas, executor);
        long start = System.currentTimeMillis();
        CompletableFuture[] completableFutures = acharPrecosStream(lojas, executor)
                .map(f -> f.thenAccept(s -> System.out.println(s + " (finalizado em: " +
                        (System.currentTimeMillis() - start + ")"))))
                .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(completableFutures).join();
        System.out.println("Todas as lojas responderam em: " + (System.currentTimeMillis() - start) + " ms");


    }

    private static List<String> acharPrecos(List<NovaLoja> lojas) {
        System.out.println("Stream sequencial");
        long start = System.currentTimeMillis();
        List<String> collect = lojas.stream()
                .map(NovaLoja::getPreco)
                .map(Orcamento::parse)
                .map(Desconto::calcularDesconto)
                .collect(Collectors.toList());
        System.out.println("Tempoo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;

    }

    private static List<String> acharPrecosAsync(List<NovaLoja> lojas, Executor executor) {
        System.out.println("Completable Future Async");
        long start = System.currentTimeMillis();
        List<CompletableFuture<String>> completableFutures = lojas.stream()
                // Pegando o preco original de forma async
                .map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
                // transforma a string em um Orcamento no momento em que ele se torna disponivel
                .map(future -> future.thenApply(Orcamento::parse))
                // Compoem o primeiro future com mais uma chamada async, para pegar os descontos
                // no momento que a primeira requisicao async estiver disponivel
                .map(future -> future.thenCompose(orcamento -> CompletableFuture.supplyAsync(() -> Desconto.calcularDesconto(orcamento), executor)))
                .collect(Collectors.toList());
        System.out.println("Tempo de invoca????o: " + (System.currentTimeMillis() - start) + " ms");

        //Espera todos os futures no stream finalizarem para terem seus resultados extra??dos
        List<String> collect = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println("Tempoo total: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println(collect);
        return collect;

    }

    private static Stream<CompletableFuture<String>> acharPrecosStream(List<NovaLoja> lojas, Executor executor) {
        System.out.println("Completable Future Async Stream");
        Stream<CompletableFuture<String>> completableFutureStream = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
                .map(future -> future.thenApply(Orcamento::parse))
                .map(future -> future.thenCompose(orcamento ->
                        CompletableFuture.supplyAsync(
                                () -> Desconto.calcularDesconto(orcamento), executor)));

        return completableFutureStream;

    }


}




