package br.curso.javacore.ZZNdatetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeAPITest5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = "20210103";
        String s5 = "2021-01-03+05:00";
        LocalDate parse1 = LocalDate.parse(s4, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse(s5, DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);
        System.out.println(parse2);

        LocalDateTime dateTime = LocalDateTime.now();
        String s6 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s6);

        LocalDateTime parse = LocalDateTime.parse("2021-01-03T19:58:31.7716697");
        System.out.println(parse);

        //dd//MM/yyyy
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        String dataBRString = "01/12/2021";
        LocalDate parse3 = LocalDate.parse(dataBRString, formatterBR);
        System.out.println(parse3);

        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String formatFR = LocalDate.now().format(formatterFR);
        System.out.println(formatFR);

        LocalDate parse4 = LocalDate.parse("03.janvier.2021", formatterFR);
        System.out.println(parse4);


    }


}
