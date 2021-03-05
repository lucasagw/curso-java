package br.curso.javacore.Hheranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereço;


    public Pessoa(String nome){
        this.nome = nome;
    }



    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereço.getRua() +
                " " + this.endereço.getBairro());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
}
