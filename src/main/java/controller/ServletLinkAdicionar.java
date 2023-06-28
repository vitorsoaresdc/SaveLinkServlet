package controller;

import Dao.LinkDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Link;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletLinkAdicionar", value = "/ServletLinkAdicionar")
public class ServletLinkAdicionar extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String url = request.getParameter("url");

        Link link = new Link();
        link.setTitulo(titulo);
        link.setUrl(url);

        LinkDao dao = new LinkDao();
        try{
            dao.adicionar(link);
        }catch (SQLException e) {
            e.printStackTrace();
        }



    }

}