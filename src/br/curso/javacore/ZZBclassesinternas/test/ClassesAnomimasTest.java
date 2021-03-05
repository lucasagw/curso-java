package br.curso.javacore.ZZBclassesinternas.test;


import br.curso.javacore.Fmodificadorestatico.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Andando");
    }
}

public class ClassesAnomimasTest {
    public static void main(String[] args) {
        Animal a = new Animal() {
            public void andar() { //método anonimo
                System.out.println("andando anonimamente");
            }
            //   public void comer(){
            //      System.out.printf("comendo");
            // }
        };
        a.andar();
        //  a.comer(); // não funciona, porque "a" não referencia ao método comer. "a" referencia ao método andar, e usa o polimorfismo.
        List<String> carroList = new ArrayList<>();
        carroList.add("BMW");
        carroList.add("Audi");
        Collections.sort(carroList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(carroList);
    }
}
