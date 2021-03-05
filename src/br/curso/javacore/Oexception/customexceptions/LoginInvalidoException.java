package br.curso.javacore.Oexception.customexceptions;

public class LoginInvalidoException extends Exception {

public LoginInvalidoException(){ //checked   nunca trate a exception dentro da classe exception, crie uma classe de tst.
    super("Usuario ou senha inválidos");
}
}
