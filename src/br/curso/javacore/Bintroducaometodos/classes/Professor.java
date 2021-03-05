package br.curso.javacore.Bintroducaometodos.classes;

// Crie os seguintes atributos para esta classe:
   //Nome
   //Matricula
   //RG
   //CPF
//Crie uma classe Test para preencher e imprimir os dados desse professor

public class Professor {
   public String nome;
   public String matricula;
   public String rg;
   public String cpf;

 public void imprime() {
     System.out.println("***********");
    System.out.println(this.cpf);
    System.out.println(this.matricula);
    System.out.println(this.nome);
    System.out.println(this.rg);


   }


}
