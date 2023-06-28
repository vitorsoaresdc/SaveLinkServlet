package Dao;

import model.Link;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LinkDao{

    public void adicionar(Link Link) throws SQLException {

        Connection conexao = fabricaConexao.getConexao();
        String sql = "INSERT INTO links(titulo, link) values(?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, Link.getTitulo());
        stmt.setString(2, Link.getUrl());
        stmt.execute();

        stmt.close();
        conexao.close();
    }
}
