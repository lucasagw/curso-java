package br.curso.javacore.Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDataTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() + 3_000_000L); //add 1 hora
        System.out.println(date); // n serve mais!
        Calendar c = Calendar.getInstance();
     //  c.setTime(date);
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 24); //roll n altera, pra alterar tem que usar add.
      //  c.roll(Calendar.MONTH, 9);
        Date date2 = c.getTime();
        System.out.println(date2);

      //NumberFormat, Locale, Calendar, Date, DateFormat
    }
}

