package br.curso.javacore.Kenum.test;

import br.curso.javacore.Kenum.classes.Cliente;
import br.curso.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente("Ana", TipoCliente.PESSOA_FISICA);
        System.out.println(c);
        System.out.println(TipoCliente.ESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());



    }
}
