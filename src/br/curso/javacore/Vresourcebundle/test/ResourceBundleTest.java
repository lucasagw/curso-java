package br.curso.javacore.Vresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("oi"));
        System.out.println(rb.getString("bom.dia"));
        System.out.println(rb.getString("show"));

        rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(rb.getString("oi"));
        System.out.println(rb.getString("bom.dia"));
        System.out.println(rb.getString("show"));

       // continuar da Aula 98: IO pt 01 Classe File para arquivos
    }
}
