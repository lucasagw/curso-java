package br.curso.javacore.Oexception.checkedexception.test;

import br.curso.javacore.Oexception.checkedexception.classes.Leitor1;
import br.curso.javacore.Oexception.checkedexception.classes.Leitor2;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }  //continuar da Aula 75: Exceptions customizadas pt 09
}

//    public static void lerArquivoOld() {
//        Reader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader("text.text"));
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//}
