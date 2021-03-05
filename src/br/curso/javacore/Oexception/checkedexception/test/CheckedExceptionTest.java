package br.curso.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest { //checked

    public static void main(String[] args) {

        abrirArquivo();

        //        try {
//            criarArquivo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.text");

        try {
            System.out.println("Arquivo criado?: " + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void abrirArquivo() {
        try {
            System.out.println("Abrindo um Arquivo");
            System.out.println("Executando a leitura do arquivo");
             throw new Exception();
            //   System.out.println("Escrevendo no arquivo");

        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();

        } finally {
            System.out.println("Fechar o arquivo");
        }

    }

}