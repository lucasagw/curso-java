package br.curso.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente() {

    }


    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }


    @Override
    public void calcularSalario() {

        this.salario = salario + (salario * 0.2);
    }


    // seria necessario implementar caso n tivesse sobrescrito na classe funcionario.
    // @Override
    // public void imprime() {

    //}
}
