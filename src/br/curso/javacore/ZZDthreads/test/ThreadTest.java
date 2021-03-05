package br.curso.javacore.ZZDthreads.test;


// Daemon x User
class ThreadExemplo extends Thread {
    private char c;

    public ThreadExemplo(char c) {

        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executado: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) { // quebra linha qd chegar em 100
                System.out.println();
            }

        }


    }
}

class ThreadExemploRunnable implements Runnable { // boa prática
    private char c;

    public ThreadExemploRunnable(char c) {

        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executado: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) { // quebra linha qd chegar em 100
                System.out.println();
            }
//            Thread.yield();
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
//        ThreadExemplo t1 = new ThreadExemplo('A');
//        ThreadExemplo t2 = new ThreadExemplo('B');
//        ThreadExemplo t3 = new ThreadExemplo('C');
//        ThreadExemplo t4 = new ThreadExemplo('D');

//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

        Thread t1 = new Thread(new ThreadExemploRunnable('A'), "T1");
        Thread t2 = new Thread(new ThreadExemploRunnable('B'), "T2");
        Thread t3 = new Thread(new ThreadExemploRunnable('C'), "T3");
        Thread t4 = new Thread(new ThreadExemploRunnable('D'), "T4");

        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t1.join();

        t2.start();

//        t3.start();
//        t4.start();


    }


}
