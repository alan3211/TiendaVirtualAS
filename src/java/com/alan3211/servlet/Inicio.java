package com.alan3211.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Inicio extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta name=\"author\" content=\"Alan Hernandez\">\n"
                + "        <meta name=\"description\" content=\"Tienda Virtual\">\n"
                + "        <meta name=\"keywords\" content=\"Tienda Virtual Alan WAD\">\n"
                + "        <title>::::WAD-Store::::</title>\n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">        \n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\"/>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/estilo.css\"/>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap-theme.min.css\"/>\n"
                + "        <script src=\"./js/jquery-2.2.3.min.js\"></script>\n"
                + "    </head>\n"
                + "    <body>\n"
                + " <!--Encabezado-->\n"
                + "                       <header>\n"
                + "                               <div class=\"container\">\n"
                + "                                          <div class=\"row\">\n"
                + "                                               <img src=\"./img/logo.png\" alt=\"Logo\" class=\"img-responsive col-md-1\">\n"
                + "                                               <h1 class=\"col-md-11\">Bienvenido a WAD-Store</h1>                                              \n"
                + "                                          </div>                                          \n"
                + "                                           <div class=\"row\">\n"
                + "                                                <p class=\"col-md-11\">Aquí encontrarás los mejores precios</p>                                                                                         \n"                                                               
                + "                                           </div>                                        \n"
                + "                               </div>\n"
                + "                       </header>"
                + "        <br>\n"
                + "        <br>        \n"                
                + "        <section class=\"container\">\n"
                + "            <div class=\"row\">\n"
                + "                <article class=\"col-xs-12 col-sm-8 col-md-9 col-lg-6\">\n"
                + "                    <img src=\"./img/tienda.jpg\" alt=\"WAD-Store\" class=\"img-thumbnail tienda center-block\"/>\n"
                + "                </article>\n"
                + "                <aside class=\"col-xs-12  col-sm-4 col-md-3 col-lg-6\">\n"
                + "                    <p class=\"descripcion text-left\">WAD-Store es una tienda que te proporcionalos articulos que hoy en día estan de moda\n"
                + "                               en el mercado.Adémas te ofrecemos los precios más baratos.</p>     \n"
                + "                    <form method=\"POST\" action=\"Computacion\">\n"
                + "                    <button type=\"submit\" class=\"btn btn-info btn-lg center-block\">Entrar</button>\n"
                + "                    </form>\n"
                + "                </aside>                \n"
                + "            </div>           \n"
                + "        </section>\n"
                + "        <br>        \n"
                + "        <br>        \n"
                + "        <br>        \n"
                + "        <br>        \n"
                + "        <footer>\n"
                + "            <div class=\"container\">\n"
                + "                            <p class=\"text-right lead\">WAD-Store &COPY; Todos los derechos reservados 2016</p>                \n"
                + "            </div>\n"
                + "        </footer>\n"
                + "    </body>\n"
                + "</html>");
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
