package br.curso.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {


        //ISO 439 pt = portugues BR - Brasil, en - ingles, US - Estadps Unidos
        Locale locItally = new Locale("it", "IT");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapao = new Locale("ja");

        Calendar c = Calendar.getInstance();
       // c.set(2015, Calendar.DECEMBER, 5);

        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locItally);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, locJapao);

        System.out.println("Itália: " + df.format(c.getTime()));
        System.out.println("Suiça: " + df2.format(c.getTime()));
        System.out.println("Indía: " + df3.format(c.getTime()));
        System.out.println("Japão: " + df4.format(c.getTime()));

        System.out.println("");
        System.out.println(locItally.getDisplayLanguage(locJapao));
        System.out.println(locJapao.getDisplayLanguage(locItally));
        System.out.println(locSuica.getDisplayLanguage(locItally));
    }


}
