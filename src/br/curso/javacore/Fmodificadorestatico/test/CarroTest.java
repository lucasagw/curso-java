package br.curso.javacore.Fmodificadorestatico.test;

import br.curso.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    int a = 5; //exemplo

    public static void main(String[] args) {
        CarroTest soma = new CarroTest();  //exemplo de como acessar atributo de classe, atributo de classe n pode acessar atraves de static, tem que fazer objeto.
        System.out.println(soma.a);

        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(220);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);


        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("#####################");


        c1.imprime();
        c2.imprime();
        c3.imprime();


    }

}
