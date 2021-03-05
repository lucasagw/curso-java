package br.curso.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z"; // "'Salvador, ' dd 'de' MMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

        //continua da Aula 89: Expressões regulares pt 01

    }}
