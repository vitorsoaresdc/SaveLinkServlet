package Dao;

import model.Link;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LinkDao{

    public static void adicionar(Link Link) throws SQLException {

        Connection conexao = fabricaConexao.getConexao();
        String sql = "INSERT INTO links(id, titulo, link) values(null,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, Link.getTitulo());
        stmt.setString(2, Link.getUrl());

        stmt.execute();
        System.out.println("executando sql aqui");
        stmt.close();
        conexao.close();
    }
}
