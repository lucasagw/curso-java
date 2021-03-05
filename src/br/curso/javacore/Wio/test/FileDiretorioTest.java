package br.curso.javacore.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
//        File diretorio = new File("Folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretório criado: " + mkdir);
//        File arquivo = new File(diretorio, "Arquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arquivo criado? " + newFile);
//
//        File arquivoNovoNome = new File(diretorio, "Arquivo_Renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Arquivo renomeado? " + renamed);
//
//        File diretorioRenomeado = new File("Folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("Diretório renamed? " + diretorioRenamed);
        buscar();
    }


    public static void buscar() {
        File file = new File("folder2");
        String[] list = file.list();
        for (String arquivos : list) {
            System.out.println(arquivos);
        }

    }

}