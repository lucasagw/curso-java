package br.curso.javacore.Oexception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            divisao(10, 0);  //nao é obrigado usar em unchecked

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static void divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        int resultado = num1 / num2;
        System.out.println(resultado);
    }

}


//        Object o = null;
//
//
////        int a = 10;
////        int b = 0;
////
////        if (b != 0) {
////            int c = a / b;
////            System.out.println(c);
////        }
//
//        try { //existe outra maneira de tratar esse problema em RuntimeException - unchecked
//            int[] a = new int[2];
//            System.out.println(a[2]);
//            System.out.println("Imprimindo depois da possível excecao");
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Fora do bloco catch");
//    }
//
//    //  System.out.println(o.toString());
//
//}
