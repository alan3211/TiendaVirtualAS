package com.alan3211.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Calcula extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta name=\"author\" content=\"Alan Hernandez\">\n"
                + "        <meta name=\"description\" content=\"Tienda Virtual\">\n"
                + "        <meta name=\"keywords\" content=\"Tienda Virtual Alan WAD\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <title>::::WAD-Store::::</title>        \n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\"/>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap-theme.min.css\"/>                       \n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/sweeralert.css\"/>                       \n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/estilo.css\"/>\n"
                + "        <script src=\"./js/jquery-2.2.3.min.js\"></script>\n"
                + "        <script src=\"js/sweetalert.min.js\"></script>\n"
                + "        <script src=\"js/Enviar.js\"></script>             \n"
                + "    </head>\n"
                + "    <body>                  \n"
                + "                <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div class=\"container\">                  \n"
                + "                                        <img src=\"./img/logo.png\" alt=\"Logo\" class=\"Logo img-rounded img-responsive\"/>\n"
                + "                                        <h1 class=\"bienvenida text-left\">Ticket de Compra</h1>                \n"
                + "                                        <p class=\"slogan text-left\">Gracias por tu compra esperamos que hayas encontrado lo que buscabas.</p>                                                                            \n"
                + "                        </div>                       \n"
                + "                </header>                        \n"
                + "                <br>\n"
                + "        <!--Seccion Principal-->\n"
                + "        <div class=\"container\">                   \n"                 
                + "                        <section class=\"main row\">\n"
                +"           <script>swal(\"Compra exitosa\",\" \",\"success\")</script>"
                + "                                    <div class=\"col-md-8 ticket\" style=\"left:450px;\">\n"
                + "                                                <p>Ticket de Compra</p>\n"
                + "                                                <p style=\"left:50px;\">Concepto    Precio</p>                                                                                                                                \n"
                + "                                    </div>                                                                                                                        \n"
                + "                        </section>\n"
                + "        </div>     \n"
                + "            <br>\n"
                + "            <br>\n"
                + "            <br>\n"
                + "            <br>                                                 \n"
                + "            <!--Pie de Pagina-->\n"
                + "            <footer>\n"
                + "                    <div class=\"container\">                            \n"
                + "                                    <p class=\"text-right piepag\">WAD-Store &COPY; Todos los derechos reservados 2016</p>                                            \n"
                + "                    </div>\n"
                + "            </footer>\n"
                + "        <!--Scripts-->\n"             
                + "  </body>\n"
                + "</html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
