package br.curso.javacore.ZZIdefault.classes;

import br.curso.javacore.ZZIdefault.interfaces.MyList;


class InterfaceTest implements MyList {

    public static void main(String[] args) {
        MyList.sort(); // chamar metodo static
        new InterfaceTest().remove(); //chamar metodo particular default
        new InterfaceTest().add(); ////chamar metodo particular sobrecarregado


    }

    @Override
    public void add() {
        System.out.println("dentro do add");
    }

}





