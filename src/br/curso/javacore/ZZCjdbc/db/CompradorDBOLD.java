package br.curso.javacore.ZZCjdbc.db;

import br.curso.javacore.ZZCjdbc.classes.Comprador;
import br.curso.javacore.ZZCjdbc.classes.MyRowSetListener;
import br.curso.javacore.ZZCjdbc.com.ConexaoFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDBOLD {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "')";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void saveTransaction() throws SQLException {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE1', 'TESTE1')";
        String sql2 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE2', 'TESTE2')";
        String sql3 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('TESTE3', 'TESTE3')";
        Connection conn = ConexaoFactory.getConexao();
        Savepoint savepoint = null;
        try {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            savepoint = conn.setSavepoint("one");
            stmt.executeUpdate(sql2);
            if (true) {
                throw new SQLException();
            }
            stmt.executeUpdate(sql3);
            conn.commit();

            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback(savepoint);
            conn.commit();

        }

    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N??o foi poss??vel excluir o registro");
            return;

        }

        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id`='" + comprador.getId() + "'";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro exclu??do com sucesso");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N??o foi poss??vel atualizar o registro");
            return;

        }

        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE `id`= '" + comprador.getId() + "'";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updatePreparedStatement(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N??o foi poss??vel atualizar o registro");
            return;

        }

        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id`= ? ";
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());

            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateRowSet(Comprador comprador) { // n??o funciona mais!!! *****
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N??o foi poss??vel atualizar o registro");
            return;

        }

        //    String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id`= ? ";
        String sql = "SELECT * FROM comprador where id = ?";

        JdbcRowSet jrs = ConexaoFactory.getRowSetConexao();
        try {
            jrs.setCommand(sql);
            //  jrs.setString(1, comprador.getCpf());
            //  jrs.setString(2, comprador.getNome());
            jrs.setInt(1, comprador.getId());
            jrs.execute();
            jrs.next(); //andar para primeira posi????o
            jrs.updateString("nome", "WILLIAM");
            jrs.updateRow();


            ConexaoFactory.close(jrs);
            System.out.println("Registro atualizado com sucesso");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateRowSetCached(Comprador comprador) { // n??o ?? conectado, trabalha em mem??ria e depois conecta e atualiza.
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N??o foi poss??vel atualizar o registro");
            return;

        }


        String sql = "SELECT * FROM comprador where id = ?";

        CachedRowSet crs = ConexaoFactory.getRowSetConexaoCached();


        try {
            crs.setCommand(sql);

            crs.setInt(1, comprador.getId());
            crs.execute();
            crs.next(); //andar para primeira posi????o
            crs.updateString("nome", "William");
            crs.updateRow();
            crs.acceptChanges();


            System.out.println("Registro atualizado com sucesso");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Comprador> selectAll() {

        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

            }

            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {

        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome LIKE '%" + nome + "%'";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));


            }

            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNamePreparedStatement(String nome) {

        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome LIKE ?";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));


            }

            ConexaoFactory.close(conn, ps, rs);
            return compradorList;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static List<Comprador> searchByNameRowSet(String nome) {

        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome LIKE ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConexao();
        jrs.addRowSetListener(new MyRowSetListener()); //status
        List<Comprador> compradorList = new ArrayList<>();

        try {
            jrs.setCommand(sql);
            jrs.setString(1, "%" + nome + "%");
            jrs.execute();

            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("cpf"), jrs.getString("nome")));


            }

            ConexaoFactory.close(jrs);
            return compradorList;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByNameCallableStatement(String nome) {

        String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`( ? )";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, "%" + nome + "%");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));


            }

            ConexaoFactory.close(conn, cs, rs);
            return compradorList;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void selectMetaData() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            //while(rs.next()) { pra navegar cada um dos registros.
            rs.next();
            int qtdColunas = rsmd.getColumnCount();
            System.out.println("Quantidades coluna: " + qtdColunas);
            for (int i = 1; i <= qtdColunas; i++) {
                System.out.println("Tabela: " + rsmd.getTableName(i));
                System.out.println("Nome Coluna: " + rsmd.getColumnName(i));
                System.out.println("Tamanho Coluna: " + rsmd.getColumnDisplaySize(i));

            }


            ConexaoFactory.close(conn, stmt, rs);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tamb??m suporta CONCUR_UPDATABLE");
                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tamb??m suporta CONCUR_UPDATABLE");

                }
            }
            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e tamb??m suporta CONCUR_UPDATABLE");

                }
            }

            ConexaoFactory.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void testTypeScroll() {

        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();


        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.last()) {
                System.out.println("??ltima linha: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("N??mero da ??ltima linha: " + rs.getRow());

            }
            System.out.println("Retornou para a Primeira Linha: " + rs.first());
            System.out.println("Primeira Linha: " + rs.getRow());
            rs.absolute(4);
            System.out.println("Linha 4: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            rs.relative(-1);
            System.out.println("Linha 3: " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println(rs.isLast());
            System.out.println(rs.isFirst());
            rs.afterLast();
            System.out.println("-----------------");
            while (rs.previous()) {
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, stmt, rs);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void updateNomeToLowerCase() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();

        try {
            DatabaseMetaData dtmd = conn.getMetaData();

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(dtmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dtmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dtmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));


            if (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toUpperCase());
                //   rs.cancelRowUpdates();
                rs.updateRow();
                //  if(rs.rowUpdated()){
                //      System.out.println("Linha atualizada!");
                //   }


            }
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "999.999.999-99");
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getString("nome") + " row" + rs.getRow());
            rs.absolute(7);
            rs.deleteRow();


            ConexaoFactory.close(conn, stmt, rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}