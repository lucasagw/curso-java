package br.curso.javacore.ZZCjdbc.com;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class ConexaoFactory {
    //java.sql = Connection, Statement, Result
    //DriveManager
    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3308/agencia?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url, user, password);


        } catch ( SQLException e ) {
            e.printStackTrace();
        }

        return null;


    }

    public static JdbcRowSet getRowSetConexao() {
        String url = "jdbc:mysql://localhost:3308/agencia?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        try {

            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);

            return jdbcRowSet;


        } catch ( SQLException e ) {
            e.printStackTrace();
        }

        return null;


    }

    public static CachedRowSet getRowSetConexaoCached() {
        String url = "jdbc:mysql://localhost:3308/agencia?useTimezone=true&serverTimezone=UTC&relaxAutoCommit=true";
        String user = "root";
        String password = "root";

        try {

            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);

            return cachedRowSet;


        } catch ( SQLException e ) {
            e.printStackTrace();
        }

        return null;


    }

    public static void close(RowSet jrs) {
        try {
            if (jrs != null)
                jrs.close();
        } catch ( SQLException e ) {
            e.printStackTrace();
        }

    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch ( SQLException e ) {
            e.printStackTrace();
        }

    }

    public static void close(Connection connection, Statement stmt) {
        close(connection);
        try {
            if (stmt != null)
                stmt.close();
        } catch ( SQLException e ) {
            e.printStackTrace();
        }

    }

    public static void close(Connection connection, Statement stmt, ResultSet rs) {
        close(connection, stmt);
        try {
            if (rs != null)
                rs.close();
        } catch ( SQLException e ) {
            e.printStackTrace();
        }

    }

}