package br.curso.javacore.Bintroducaometodos.classes.introducaometodos.test;

import br.curso.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.cpf = "061.397.725-40";
        prof.matricula = "200001172";
        prof.nome = "Lucas";
        prof.rg = "065257-46";

        Professor prof2 = new Professor();
        prof2.cpf = "123.456.789-10";
        prof2.matricula = "5424";
        prof2.nome = "Augusto";
        prof2.rg = "6578925-20";

       prof.imprime();
       prof2.imprime();







    }




}
