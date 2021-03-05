package br.curso.javacore.Oexception.checkedexception.classes;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    public void salvar() throws FileNotFoundException {  //na sobrescrita eu escolho em não declarar exception, declarar parte ou declarar todas, da classe pai.
        //Obs: não posso declarar outra exception que não foi declarada na classe pai. Não pode lançar exception superclasse generica tbm, mas pode lançar as filhas subclasses.
        //posso declarar a superclasse RuntimeException e suas subclasses, mesmo não estando na classe principal criada.
        System.out.println("deu ruim");
    }

}
