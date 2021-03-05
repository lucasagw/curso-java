package br.curso.javacore.ZZEconcorrencia.test;


import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {  // a melhor classe do segmento Queue.

    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("William"));
        tq.put("DevDojo");
        System.out.println(tq.offer("William"));
        System.out.println(tq.offer("William", 10, TimeUnit.MILLISECONDS));
        //    tq.transfer("Devdojo");
        System.out.println(tq.tryTransfer("DevDojo"));
        System.out.println(tq.tryTransfer("DevDojo", 1, TimeUnit.SECONDS));


        System.out.println(tq.remainingCapacity());

        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll()); // remove
        System.out.println(tq.poll(10, TimeUnit.MILLISECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());

    }

}


