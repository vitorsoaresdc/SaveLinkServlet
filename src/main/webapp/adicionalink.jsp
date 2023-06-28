<%--
  Created by IntelliJ IDEA.
  User: vitorsoares
  Date: 13/06/23
  Time: 03:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adiciona Link</title>
</head>
<body>
    <form action="ServletLinkAdicionar" method="GET">
    Titulo: <br>
    <input type="text" name="titulo"><br>
    URL: <br>
    <input type="text" name="url"><br><br>
    <button>Adicionar</button>
    </form>
</body>
</html>
