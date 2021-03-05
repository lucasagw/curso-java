package br.curso.javacore.Fmodificadorestatico.classes;

public class Cliente {
    // 1 - Bloco de inicialização static é executado quando a JVM carregar a classe. É executado apenas uma vez.
    // 2 - Alocado o espaço na memoria para o objeto que será criado.
    // 3 - Cada atributo de classe é criado e inicializado com seus valores default, ou valores explicitos.
    // 4 - Bloco de inicialização é executado.
    // 5 - O construtor é executado.
    private static int[] parcelas;

    static { //bloco de inicialização

        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;

        }
    }


    public Cliente() {


    }

    public static int[] getParcelas() {
        return parcelas;
    }


}
