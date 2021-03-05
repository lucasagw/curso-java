package br.curso.javacore.Eblocodeinicializacao.test;

import br.curso.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("exibindo quantidade de parcelas possíveis.");
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");

            // continuar da aula 42.
        }
    }
}