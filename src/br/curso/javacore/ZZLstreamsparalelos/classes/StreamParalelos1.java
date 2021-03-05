package br.curso.javacore.ZZLstreamsparalelos.classes;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamParalelos1 {
    public static void main(String[] args) {
        long num = 10_000_000_000L;
        somaFor(num);
//        somaStreamIterate(num);
//        somaParallelStreamIterate(num);
        somaRangedClosedStream(num);
        somaRangedClosdParallelStream(num);
        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "'12"); //não é recomendado, ter mais thread nao significa que o sistema será mais rápido


    }


    private static void somaFor(long num) {
        System.out.println("For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1L; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");


    }

    private static void somaStreamIterate(long num) {  //Unboxing e o boxing, prejudica performace
        System.out.println("Stream Sequencial");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum); // reduce para finalizar a soma
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");


    }

    private static void somaParallelStreamIterate(long num) { //Unboxing e o boxing, prejudica performace
        System.out.println("Stream Paralelos");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum); // reduce para finalizar a soma
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");


    }

    private static void somaRangedClosedStream(long num) {
        System.out.println("Ranged Closed Sequencial Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum); //reduzir a uma soma
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");


    }

    //[1,2,3,4,5,6,7,8,9,10]
    //[1-5] [6-10]
    private static void somaRangedClosdParallelStream(long num) {
        System.out.println("Ranged Closed Parallel Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum); //reduzir a uma soma
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");


    }


}

