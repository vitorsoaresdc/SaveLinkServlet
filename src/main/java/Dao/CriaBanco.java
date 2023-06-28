package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaBanco {
    public static void main(String[] args) throws SQLException {

        Connection conexao = fabricaConexao.getConexao();
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS teste2");

        System.out.println("Banco criado com Sucesso!");
    }
}
