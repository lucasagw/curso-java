package br.curso.javacore.Oexception.runtimeexception.test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {

    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();

        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {  //A PARTIR DO JAVA 7 PODE FAZER ASSIM
            System.out.println("");
        }
        System.out.println("Final do programa");


        try { //exemplo de checked
            talvezLanceException();
        } catch (Exception e) {  //A PARTIR DO JAVA 7 PODE FAZER ASSIM

        }

    }

    private static void talvezLanceException() throws SQLException, AWTException, FileNotFoundException {

    }
}




