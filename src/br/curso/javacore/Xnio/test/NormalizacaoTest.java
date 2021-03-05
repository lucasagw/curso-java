package br.curso.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioProjeto = "CursoJava\\home\\lucas\\dev";
        String arquivoTxt = "..\\..\\arquivo.txt";  //voltar dois diretorios.
        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());

        Path p2 = Paths.get("home/./lucas/./dev"); //referindo ao mesmo diretório.
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
