package br.curso.javacore.Hheranca.classes;

public class Endereco {
    private String bairro;
    private String rua;


   public void print(){
       System.out.println();
   }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
