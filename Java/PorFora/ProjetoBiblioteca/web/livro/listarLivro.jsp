<%@page import="br.com.DTO.LivroDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.DAO.LivroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            try {
                LivroDAO objLivroDAO = new LivroDAO();
                ArrayList<LivroDTO> lista = objLivroDAO.PesquisarLivro();

                for (int num = 0; num < lista.size(); num++) {
                    out.print("Código: " + lista.get(num).getId_livro() + "<br>");
                    out.print("Nome: " + lista.get(num).getNome_livro() + "<br>");
                }

            } catch (Exception e) {
            }

        %>

    </body>
</html>
