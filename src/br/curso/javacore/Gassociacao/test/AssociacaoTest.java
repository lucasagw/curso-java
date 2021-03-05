package br.curso.javacore.Gassociacao.test;

import br.curso.javacore.Gassociacao.classes.Aluno;
import br.curso.javacore.Gassociacao.classes.Local;
import br.curso.javacore.Gassociacao.classes.Professor;
import br.curso.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas Walter", 24);
        Aluno aluno1 = new Aluno("Dayana Lima", 21);


        Seminario seminario = new Seminario("Como ser um baita programador e ficar rico.");

        Professor professor = new Professor("Yoda", "Usar a força para programar");

        Local local = new Local("Rua das araras", "Mato");

        aluno.setSeminario(seminario);
        aluno1.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno, aluno1});

        Seminario[] seminarioArray = new Seminario[1];
        seminarioArray[0] = seminario;
        professor.setSeminarios(seminarioArray);

        seminario.ptint();
        professor.print();
        aluno.print();
        aluno1.print();
        local.print();



    }

}
