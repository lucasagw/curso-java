package br.curso.javacore.Csobrecargametodos.classes;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;


    public Funcionario(String nome, String cpf, double salario, String rg) {  //construtor parametrizado
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;

    }

    public Funcionario() {  //construtor vazio, sobrecarga de construtor


    }

    // metódo de inicialização   public void init(String nome, String cpf, double salario) {
    //  this.nome = nome;
    //   this.cpf = cpf;
    //     this.salario = salario;
    //   }

    // metôdo de inicialização   public void init(String nome, String cpf, double salario, String rg) { sobrecarga de método.
    // init(nome, cpf, salario);
    // this.rg = rg;


    //}


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }


}
