package br.curso.javacore.Oexception.checkedexception.test;

import br.curso.javacore.Oexception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {

    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "222";

        String usuarioDigitado = "Goku";
        String senhaDigitado = "123";

        if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitado)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado");
        }

    }


}
