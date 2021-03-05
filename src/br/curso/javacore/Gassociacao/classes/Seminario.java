package br.curso.javacore.Gassociacao.classes;

public class Seminario {
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    private String titulo;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void ptint() {
        System.out.println("-------Relação de Seminário--------");
        System.out.println("Título: " + this.titulo);

        if (professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());

        } else {
            System.out.println("Nenhmum professor cadastrado.");

        }
        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminário");
        }
        if (alunos != null && alunos.length != 0) {
            System.out.println("Aluno incsrito:");
            for (Aluno alun : alunos) {
                System.out.println(alun.getNome());
                // System.out.println(alun.getIdade());
            }
            return;
        }
        System.out.println("Nenhum sluno cadastrado.");

    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
