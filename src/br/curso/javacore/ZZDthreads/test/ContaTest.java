package br.curso.javacore.ZZDthreads.test;

import br.curso.javacore.ZZDthreads.classes.Conta;

public class ContaTest implements Runnable {

    private final Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread lucas = new Thread(contaTest, "Lucas");
        Thread dayane = new Thread(contaTest, "Dayane");
        lucas.start();
        dayane.start();


    }

    public static void imprime() {
        synchronized (ContaTest.class) {
            System.out.println("aaaaa");
        }

    }

    private void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                conta.saque(valor);
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo:" + conta.getSaldo());

            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Oh meu Deus!");
            }
        }
    }
}
