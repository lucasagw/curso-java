package br.curso.javacore.ZZCjdbc.interfaces;

import br.curso.javacore.ZZCjdbc.classes.Carro;

import java.util.List;

public interface CarroDAO {
    void save(Carro carro);

    void delete(Carro carro);

    void update(Carro carro);

    List<Carro> selectAll();

    List<Carro> searchByName(String nome);
}
