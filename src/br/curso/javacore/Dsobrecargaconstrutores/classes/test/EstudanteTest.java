package br.curso.javacore.Dsobrecargaconstrutores.classes.test;

import br.curso.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante("1214", "Walter", new double[]{5, 7, 9}, "08/08/2017");
        estudante.imprime();

    }
}
