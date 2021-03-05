package br.curso.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {

    private double salario;


    public Funcionario(String nome) {
        super(nome);
    }

    public void print() {
        super.print();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();


    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
