package com.alan3211.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Computacion extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String[] prod = new String[12];    //Nombre de los productos
        String[] cant = new String[12];    //Valor de la cantidad       
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession();
        /*Recuperando atributos*/        
        for (int i = 0; i < prod.length; i++) {
            if(sesion.getAttribute("pr"+i) != null){
            prod[i] = (String) sesion.getAttribute("pr"+i); //Obteniendo el checkbox del producto
            cant[i] = (String) sesion.getAttribute("cantidad"+i); //Obteniendo la cantidad asociada
            }   
        }
        /*Estableciendo atributos*/
        for (int i = 0; i < prod.length; i++) {
            prod[i] = (String)request.getParameter("pr"+i);
            cant[i] = (String)request.getParameter("cantidad"+i);
            sesion.setAttribute("pr" + i, prod[i]); // Estableciendo el checkbox marcado
            sesion.setAttribute("cantidad"+i, cant[i]); // Estableciendo la cantidad ingresada
        }
         
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
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/estilo.css\"/>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap-theme.min.css\"/>               \n"
                + "        <script src=\"./js/jquery-2.2.3.min.js\"></script>\n"
                + "        <script src=\"js/Enviar.js\"></script>             \n"
                + "    </head>\n"
                + "    <body>                  \n"
                + "                <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div class=\"container\">                  \n"
                + "                                        <img src=\"./img/logo.png\" alt=\"Logo\" class=\"Logo img-rounded img-responsive\"/>\n"
                + "                                        <h1 class=\"bienvenida text-left\">Bienvenido al Departamento de Computación</h1>                \n"
                + "                                        <p class=\"slogan text-left\">Aquí encontrarás los productos más modernos del mercado.</p>\n"
                + "                                        <a href=\"javascript:Calcula()\" class=\"enlaces col-sm-2\"><span class=\"glyphicon glyphicon-log-out\"></span>CheckOut</a>                                       \n"
                + "                        </div>                       \n"
                + "                </header>        \n"
                + "                <!--Navegacion-->\n"
                + "                <div class=\"container\">                \n"
                + "                        <nav class=\" navbar navbar-default nav-justified\">\n"
                + "                                 <div class=\"container-fluid\">\n"
                + "                                     <div class=\"navbar-header\">\n"
                + "                                         <button type=\"button\" class=\"navbar-toggle collapse\" data-toggle=\"collapse\" data-target=\"#navbar-1\">\n"
                + "                                             <span class=\"sr-only\">Departamentos</span>\n"
                + "                                             <span class = \"icon-bar \">Computación</span>\n"
                + "                                             <span class = \"icon-bar\">Electrodomésticos</span>\n"
                + "                                             <span class = \"icon-bar\">Mueblería</span>\n"
                + "                                         </button>\n"
                + "                                         <a href=\"javascript:enviarC()\" class=\"navbar-brand\">Departamentos</a>\n"
                + "                                     </div>\n"
                + "                                     \n"
                + "                                     <div class=\"collapse navbar-collapse\" id=\"navbar-1\">\n"
                + "                                             <ul class=\"nav navbar-nav\">\n"
                + "                                                    <li class=\"active\"><a href=\"javascript:enviarC()\">Computación  <span class=\"glyphicon glyphicon-phone\"></span></a></li>\n"
                + "                                                    <li><a href=\"javascript:enviarE()\">Eletrodomésticos  <span class=\"glyphicon glyphicon-lamp\"></span></a></li>\n"
                + "                                                    <li><a href=\"javascript:enviarM()\">Mueblería  <span class=\"glyphicon glyphicon-bed\"></span></a></li>\n"
                + "                                        </ul>     \n"
                + "                                     </div>\n"
                + "                                 </div>\n"
                + "                            </nav>\n"
                + "                </div>\n"
                + "            <br>\n"
                + "            <br>\n"
                + "            <br>                \n"
                + "        <!--Seccion Principal-->\n"
                + "        <div class=\"container\">                   \n"
                + "                        <section class=\"main row\">\n"
                + "                                    <form method=\"POST\" action=\"Calcula\" name=\"depa\">\n"
                + "                                                    <div class=\"col-md-3\">                         \n"
                + "                                                              <p>Computadora MAC</p>\n"
                + "                                                              <img src=\"./Computadoras/macos.jpg\" alt=\"Mac OSx\" >\n"
                + "                                                               <p>Ideal para las personas muy capacitadas en desarrollo profesional</p>\n"
                + "                                                               <p>$25,000</p>\n"
                + "                                                               <label for=\"pr0\">Agregar</label>\n");
        if (prod[0] == null || cant[0] == null) {
            if (prod[0] == null && cant[0] != null) {
            } else {
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr0\">");
                out.println(" <label for=\"cantidad0\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad0\" size=\"1\">");
            }
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr0\"checked>");
            out.println(" <label for=\"cantidad0\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad0\" size=\"1\" value = '" + cant[0] + "'>");
        }
        out.println("                            </div>\n"
                + "                                                    <div class=\"col-md-3\">\n"
                + "                                                                <p>Computadora Alienware</p>\n"
                + "                                                                <img src=\"./Computadoras/alienware.jpg\" alt=\"Alienware\" width=\"230\" height=\"175\">\n"
                + "                                                                <p>Experimenta el poder de esta computadora para juegos</p>\n"
                + "                                                                <p>$29,000</p>\n"
                + "                                                                <label for=\"pr1\">Agregar</label>");
        if (prod[1] == null || cant[1] == null) {
            if (prod[1] == null && cant[1] != null) {
            } else {
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr1\">");
                out.println(" <label for=\"cantidad1\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad1\" size=\"1\">");
            }
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr1\"checked>");
            out.println(" <label for=\"cantidad1\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad1\" size=\"1\" value = '" + cant[1] + "'>");
        }
        out.println("                                    </div>\n"
                + "                                                    <div class=\"col-md-3\" >\n"
                + "                                                                <p>Computadora HP</p>\n"
                + "                                                                <img src=\"./Computadoras/hppav.jpeg\" alt=\"Hp Pavilion\" width=\"230\" height=\"175\">\n"
                + "                                                                <p>Prueba esta computadora para oficina, o simplemente para casa</p>\n"
                + "                                                                <p>$12,000</p>\n"
                + "                                                                <label for=\"pr2\">Agregar</label>");
        if (prod[2] == null || cant[2] == null) {
            if (prod[2] == null && cant[2] != null) {
            } else {
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr2\">");
                out.println(" <label for=\"cantidad2\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad2\" size=\"1\">");
            }
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr2\"checked>");
            out.println(" <label for=\"cantidad2\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad2\" size=\"1\" value = '" + cant[2] + "'>");
        }
        out.println("                               </div>\n"
                + "                                                    <div class=\"col-md-3\">\n"
                + "                                                                <p>Computadora Samsung</p>\n"
                + "                                                                <img src=\"./Computadoras/samsung.jpg\" alt=\"Samsung\" width=\"230\" height=\"175\">\n"
                + "                                                               <p>Economica y simple para trabajos de la escuela de los niños</p>\n"
                + "                                                               <p>$8,000</p>\n"
                + "                                                               <label for=\"pr3\">Agregar</label>");
        if (prod[3] == null || cant[3] == null) {
            if (prod[3] == null && cant[3] != null) {
            } else {
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr3\">");
                out.println(" <label for=\"cantidad3\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad3\" size=\"1\">");
            }
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr3\"checked>");
            out.println(" <label for=\"cantidad3\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad3\" size=\"1\" value = '" + cant[3] + "'>");
        }
        for (int i = 4; i < prod.length; i++) {                               
                            if(prod[i] == null){
                                out.println("<input type=\"checkbox\" name=\"pr"+i+"\" >\n");
                            }else{
                                out.println("<input type=\"checkbox\" name=\"pr"+i+"\" checked>\n");
                            }
        }        
        out.println("                             </div> \n"
                + "<script>javascript:ocultaC()</script>"
                + "                                </form>\n"
                + "                    </section>\n"
                + "            </div>     \n"
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
                + "  </body>\n"
                + "</html>"
    

    

    );

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void rellenacantidad(String[]nomcan) {
        for (int i = 0; i < nomcan.length; i++) {
            nomcan[i] = "can" + i;
        }
    }
}
