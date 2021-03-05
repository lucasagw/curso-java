package br.curso.javacore.Bintroducaometodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }

        }
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possuí notas.");
            return;
        }

        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media >= 6) {
            this.aprovado = true;
            System.out.println("\nAluno aprovado, Nota: " + media);
            return;
        }
        this.aprovado = false;
        System.out.println("Alundo reprovado, Nota: " + media);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("ERRO IDADE INCORRETA");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }


    public boolean isAprovado() {   //usado no lugar do get, IS.
        return this.aprovado;

    }


}
