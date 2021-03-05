package br.curso.javacore.Uexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d - todos os digitos.
        // \D - tudo o que não for digito.
        // \s - espaços em branco.\t \n \f \r
        // \S - caractere que não é branco
        // \w - caracteres de palavras a-z A-Z, digitos e _
        // \W - tudo que não for caractere de palavra
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // [n,m] de n até m ocorrencias
        // ( )
        // | OU
        // $ fim de linha
        // . coringa (pode ser string e outra coisa)   \\. string
        // ex: o(v|c)o = ovo, oco   maca(rr|c)ão = macarrão, macacão
        // ^ [^ABC] negação
//
//        String regex = "[abcABC]";
//        String texto = "cafeBABE";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(texto);

        //   int hex = 0x1;
//        String regex2 = "0[xX]([0-9a-fA-F])*(\\s|$)";
//        String texto2 = "12 0x 0X OxFFABC Ox10G Ox1";

//        String regex2 = "([a-zA-Z0-9\\._-]) + @([a-zA-Z]) + (\\.([a-zA-Z]) +)+"; //"([\\w\\.]) + @([a-zA-Z]) + (\\.([a-zA-Z]) +)+";
//        String texto2 = "fulano@hotmail.com, 102Abc@gmail.com, #@!abraomail.br, teste@gmail.com.br, teste@mail";

//        String regex2 = "\\d[2]/\\d[2]/\\d[2,4]";
//        String texto2 = "05/05/2010 05/05/2015 1/1/1 01/05/95"; // dd/MM/yyyy

        String regex2 = "proj([^,])*";
        String texto2 = "proj1.bkp, proj1.java, proj1.class, projfinal.java, proj2.bkp, proj3.java, diagrama, texto, foto";


        //    System.out.println("Email válido? " + "#@!abrao@mail.br".matches(regex2));
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);

//        System.out.println("texto: " + texto);
        System.out.println("texto: " + texto2);
        System.out.println("Indíce: 012345678901234567");
//        System.out.println("expressão: " + matcher.pattern());
        System.out.println("expressão: " + matcher2.pattern());

        System.out.println("Posições encontradas");
//        while (matcher.find()) {
//            System.out.print(matcher.start() + " ");
        //}
        //    System.out.println("Posições encontradas2");
        while (matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.group());


         // continuar da  Aula 95: Tokens e Delimitadores com String e Scanner

        }

    }
}
