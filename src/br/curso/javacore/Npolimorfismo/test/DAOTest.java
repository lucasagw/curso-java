package br.curso.javacore.Npolimorfismo.test;

import br.curso.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.curso.javacore.Npolimorfismo.classes.DataBaseDAOimpl;
import br.curso.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();  //posso mudar para DataBaseDAOimpl(); pq é de generico para especifico.
        arquivoDAO.save();
        GenericDAO dataBaseDAO = new DataBaseDAOimpl(); // posso mudar para ArquivoDAOImpl();, pq é de generico para especifico.
        dataBaseDAO.save();
    }
}
     //continuar da Aula 67: Exceptions pt 01