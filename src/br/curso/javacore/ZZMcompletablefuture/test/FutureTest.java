package br.curso.javacore.ZZMcompletablefuture.test;

import java.util.concurrent.*;

public class FutureTest {
    private static ExecutorService exwcutorSerice = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {
        Future<Double> future = exwcutorSerice.submit(() -> {
                TimeUnit.SECONDS.sleep(2);
                return 2000D;
        });
        enrolando(); //assíncrono
        try {
            Double resultado = future.get(3, TimeUnit.SECONDS); //ou podia ser o .get();
            System.out.println(resultado); //síncrono

        } catch ( InterruptedException | TimeoutException | ExecutionException e ) {
            e.printStackTrace();
        }finally {
            exwcutorSerice.shutdown();
        }

    }
    private static void enrolando() {
     long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);

   }

}
