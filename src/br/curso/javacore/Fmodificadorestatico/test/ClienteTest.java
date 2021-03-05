package br.curso.javacore.Fmodificadorestatico.test;


import br.curso.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("exibindo quantidade de parcelas possíveis.");
//        for (int parcela : c.getParcelas()) {
//            System.out.print(parcela + " ");

       System.out.println("Tamanho: " + Cliente.getParcelas().length);

   //  }

    }
}