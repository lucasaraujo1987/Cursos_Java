<%@page import="javax.swing.JOptionPane"%>
<%@page import="br.com.DAO.LivroDAO"%>
<%@page import="br.com.DTO.LivroDTO"%>
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
                LivroDTO objLivroDTO = new LivroDTO();
                objLivroDTO.setNome_livro(request.getParameter("nome"));

                LivroDAO objLivroDAO = new LivroDAO();
                objLivroDAO.CadastrarLivro(objLivroDTO);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro JSP" + e);
            }


        %>
    </body>
</html>
