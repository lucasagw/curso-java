package br.curso.javacore.Npolimorfismo.classes;

public class DataBaseDAOimpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
