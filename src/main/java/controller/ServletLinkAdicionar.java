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

    public ServletLinkAdicionar(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String titulo = request.getParameter("titulo");
            String url = request.getParameter("url");


        Link link = new Link();

        link.setTitulo(titulo);
        link.setUrl(url);

        LinkDao linkdao = new LinkDao();

        try{
            linkdao.adicionar(link);

        } catch(SQLException e) {
            e.printStackTrace();
        }

//        String nextPage = "index.jsp";
//
//        RequestDispatcher rd = request.getRequestDispatcher(nextPage);
//        rd.forward(request,response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request,response);
//    }
}
