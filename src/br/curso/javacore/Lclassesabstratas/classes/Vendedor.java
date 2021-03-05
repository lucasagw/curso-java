package br.curso.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }


    @Override
    public void calcularSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }


    // seria necessario implementar caso n tivesse sobrescrito na classe funcionario.
    //  @Override
    //  public void imprime() {
    //    System.out.println("Dentro do metodo imprime");
    // }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
