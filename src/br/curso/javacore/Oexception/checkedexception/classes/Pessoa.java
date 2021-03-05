package br.curso.javacore.Oexception.checkedexception.classes;

import br.curso.javacore.Oexception.customexceptions.LoginInvalidoException;

import java.io.IOException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("deu ruim 2");



    }
}
