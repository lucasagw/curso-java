package br.curso.javacore.YSerializacao.test;

import br.curso.javacore.YSerializacao.classes.Aluno;
import br.curso.javacore.YSerializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {

    gravadorObjeto();
    leitorObjeto();
    }

    private static void gravadorObjeto() {
        Turma t = new Turma("Maratona Java, só para os campeões.");
        Aluno aluno = new Aluno(1L, "Lucas Augusto", "200001172");
        aluno.setTurma(t);
        try (ObjectOutputStream oas = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oas.writeObject(aluno);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void leitorObjeto() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}