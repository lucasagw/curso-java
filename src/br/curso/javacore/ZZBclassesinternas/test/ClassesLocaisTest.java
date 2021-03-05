package br.curso.javacore.ZZBclassesinternas.test;

public class ClassesLocaisTest {
    private String nome = "William";

    public void fazAlgumaCoisa() {
        String sobrenome = "Suane";
        class Interna {
            public void imprimirNomeExterno() {
                System.out.println(nome);
                System.out.println(sobrenome);
            }
        }
        Interna in = new Interna();
        in.imprimirNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
