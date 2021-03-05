package br.curso.javacore.Zcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes  = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("DevDojo");

        nomes2.add("Lucas2");
        nomes2.add("DevDojo2");

        System.out.println("Size: " + nomes.size());
        System.out.println("Remove: " + nomes.remove("DevDojo")); //ou o indice
        System.out.println("Size: " + nomes.size());
       // nomes.clear();
        nomes.addAll(nomes2);

        int size = nomes.size();
        for(int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }
       List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for (Integer num : numeros) {
            System.out.println(num);
        }

    }
}
