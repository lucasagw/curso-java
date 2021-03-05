package br.curso.javacore.Wio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            boolean exits = file.exists();
            System.out.println("Arquivo de leitura? " + file.canRead());
            System.out.println("path: " + file.getPath());
            System.out.println("path completo: " + file.getAbsolutePath());
            System.out.println("Diretorio? " + file.isDirectory());
            System.out.println("Oculto? " + file.isHidden());
            System.out.println("last modified: " + new Date(file.lastModified()));
            if (exits) {
                System.out.println("Arquivo deletado? " + file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
