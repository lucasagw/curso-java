package br.curso.javacore.Bintroducaometodos.classes.introducaometodos.test;

import br.curso.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.setNome("Lucas Walter");
        aluno1.setIdade(-1);
        aluno1.setNotas(new double[]{8.5, 9, 7.5});

        aluno1.print();
        aluno1.tirarMedia();

        System.out.println(aluno1.getNome());
        System.out.println("Aprovado? " + aluno1.isAprovado());

        //continuar da aula 38.


    }

}
