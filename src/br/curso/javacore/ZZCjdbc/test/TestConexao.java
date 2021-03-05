package br.curso.javacore.ZZCjdbc.test;

import br.curso.javacore.ZZCjdbc.classes.Comprador;
import br.curso.javacore.ZZCjdbc.db.CompradorDBOLD;

import java.sql.SQLException;
import java.util.List;

public class TestConexao {

    public static void main(String[] args) {
        //   deletar();
        //    atualizar();
        //   List<Comprador> listaComprador = selecionarTudo();
        // List<Comprador> listaComprador2 = buscarPorNome("ria");
        // System.out.println(listaComprador);
        // System.out.println(listaComprador2);
        //     CompradorDB.selectMetaData();
        //  CompradorDB.checkDriverStatus();
        // CompradorDB.testTypeScroll();
        // CompradorDB.updateNomeToLowerCase();
        // System.out.println(CompradorDB.searchByNamePreparedStatement("oao")); //sql injection
        // CompradorDB.updatePreparedStatement(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));
        //   System.out.println(CompradorDB.searchByNameCallableStatement("%oao%"));
        //     System.out.println(CompradorDB.searchByNameRowSet("oao"));
        //  CompradorDB.updateRowSetCached(new Comprador(1, "011.011.011-01", "Prepared Statement da Silva"));
        try {
            CompradorDBOLD.saveTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void inserir() {
        Comprador comprador = new Comprador("111.111.111-22", "Augusto");
        CompradorDBOLD.save(comprador);

    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(3);
        CompradorDBOLD.delete(comprador);

    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "MARIA", "000.000.000-11");
        CompradorDBOLD.update(comprador);
    }


    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }

    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }

}
