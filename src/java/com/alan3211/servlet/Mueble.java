package com.alan3211.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Mueble extends HttpServlet {

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
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap-theme.min.css\"/>        \n"
                + "        <script src=\"./js/jquery-2.2.3.min.js\"></script>\n"
                + "        <script src=\"js/Enviar.js\"></script>           \n"
                + "    </head>\n"
                + "    <body>\n"
                + "              <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div class=\"container\">                  \n"
                + "                                        <img src=\"./img/logo.png\" alt=\"Logo\" class=\"Logo img-rounded img-responsive\"/>\n"
                + "                                        <h1 class=\"bienvenida text-left\">Bienvenido al Departamento de Mueblería</h1>                \n"
                + "                                        <p class=\"slogan text-left\">Aquí encontrarás los productos más modernos del mercado.</p>\n"
                + "                                        <a href=\"javascript:Calcula()\" class=\"enlaces col-sm-2\"><span class=\"glyphicon glyphicon-log-out\"></span>CheckOut</a>                                       \n"
                + "                        </div>                       \n"
                + "                </header>           \n"
                + "            <div class=\"container\">                \n"
                + "                    <nav class=\" navbar navbar-default nav-justified\">\n"
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
                + "                                    <div class=\"collapse navbar-collapse\" id=\"navbar-1\">\n"
                + "                                        <ul class=\"nav navbar-nav\">\n"
                + "                                            <li><a href=\"javascript:enviarC()\">Computación  <span class=\"glyphicon glyphicon-phone\"></span></a></li>\n"
                + "                                            <li><a href=\"javascript:enviarE()\">Eletrodomésticos  <span class=\"glyphicon glyphicon-lamp\"></span></a></li>\n"
                + "                                            <li class=\"active\"><a href=\"javascript:enviarM()\">Mueblería  <span class=\"glyphicon glyphicon-bed\"></span></a></li>\n"
                + "                                        </ul>     \n"
                + "                                     </div>\n"
                + "                                 </div>\n"
                + "                    </nav>\n"
                + "            </div>\n"
                + "            <br>\n"
                + "            <br>\n"
                + "            <br>  \n"
                + "      <!--Seccion Principal-->\n"
                + "       <div class=\"container\">                   \n"
                + "                        <section class=\"main row\">\n"
                + "                                    <form method=\"POST\" action=\"Calcula\" name=\"depa\">                     \n"
                + "                                                <div class=\"col-md-3\">                         \n"
                + "                                                          <p>Cajonera</p>\n"
                + "                                                          <img src=\"./Muebles/mueble1.jpg\" alt=\"Cajonera\" width=\"230\" height=\"175\">\n"
                + "                                                           <p>Llevatelo para que tu televisión se vea espectacular.</p>\n"
                + "                                                           <p>$8,000</p>\n"
                + "                                                           <label for=\"pr8\">Agregar</label>");
        if (prod[8] == null && cant[8] == null) {         
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr8\">");
                out.println(" <label for=\"cantidad8\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad8\" size=\"1\" value = \"1\">");            
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr8\"checked>");
            out.println(" <label for=\"cantidad8\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad8\" size=\"1\" value = '" + cant[8] + "'>");           
        }
        out.println("                                                </div>\n"
                + "                                                <div class=\"col-md-3\">\n"
                + "                                                         <p>Repisa</p>\n"
                + "                                                          <img src=\"./Muebles/mueble2.jpg\" alt=\"Repisa\" width=\"230\" height=\"175\">\n"
                + "                                                           <p>Para guardar tus libros o documentos atu gusto</p>\n"
                + "                                                           <p>$2,800</p>\n"
                + "                                                           <label for=\"pr9\">Agregar</label>");
        if (prod[9] == null && cant[9] == null) {        
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr9\">");
                out.println(" <label for=\"cantidad9\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad9\" size=\"1\" value = \"1\">");
            
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr9\"checked>");
            out.println(" <label for=\"cantidad9\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad9\" size=\"1\" value = '" + cant[9] + "'>");            
        }
        out.println("                                                </div>\n"
                + "                                                <div class=\"col-md-3\">\n"
                + "                                                           <p>Sofa Deluxe</p>\n"
                + "                                                          <img src=\"./Muebles/mueble3.jpg\" alt=\"Sofa Deluxe\" width=\"230\" height=\"175\">\n"
                + "                                                           <p>Ideal para que tu  casa se vea elegante</p>\n"
                + "                                                           <p>$7,000</p>\n"
                + "                                                           <label for=\"pr10\">Agregar</label>");
        if (prod[10] == null && cant[10] == null) {          
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr10\">");
                out.println(" <label for=\"cantidad10\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad10\" size=\"1\" value = \"1\">");
            
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr10\"checked>");
            out.println(" <label for=\"cantidad10\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad10\" size=\"1\" value = '" + cant[10] + "'>");           
        }
        out.println("                                                </div>\n"
                + "                                                <div class=\"col-md-3\">\n"
                + "                                                             <p>Comedor simple</p>\n"
                + "                                                          <img src=\"./Muebles/mueble4.jpg\" alt=\"Comedor simple\" width=\"230\" height=\"175\">\n"
                + "                                                           <p>Especialmente para tu sala moderna</p>\n"
                + "                                                           <p>$10,000</p>\n"
                + "                                                           <label for=\"pr11\">Agregar</label>");
        if (prod[11] == null && cant[11] == null) {          
                out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr11\">");
                out.println(" <label for=\"cantidad11\" class=\"control-label\">Cantidad</label>");
                out.println("<input type=\"text\" name=\"cantidad11\" size=\"1\" value = \"1\">");           
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr11\"checked>");
            out.println(" <label for=\"cantidad11\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad11\" size=\"1\" value = '" + cant[11] + "'>");           
        }
        for (int i = 0; i < 8; i++) {
            if (prod[i] == null) {
                out.println("<input type=\"checkbox\" name=\"pr" + i + "\" >\n");
                  out.println("<input type=\"text\" name=\"cantidad"+i+"\" size=\"1\" value = \"1\">"); 
            } else {
                out.println("<input type=\"checkbox\" name=\"pr" + i + "\" checked>\n");
                out.println("<input type=\"text\" name=\"cantidad"+i+"\" size=\"1\" value = \""+cant[i]+"\">");
            }
        }
        out.println("                                                </div>\n"
                + "<script>javascript:ocultaM()</script>"
                + "                            </form>  \n"
                + "                    </section>\n"
                + "                    </div>\n"
                + "           <br>\n"
                + "            <br>\n"
                + "            <br>\n"
                + "            <br>  \n"
                + "            <!--Pie de Pagina-->\n"
                + "            <footer>\n"
                + "                    <div class=\"container\">                            \n"
                + "                                    <p class=\"text-right piepag\">WAD-Store &COPY; Todos los derechos reservados 2016</p>                                            \n"
                + "                    </div>\n"
                + "            </footer>\n"                
                + "    </body>\n"
                + "</html>");
        /*Estableciendo atributos*/
        for (int i = 0; i < prod.length; i++) {
            prod[i] = (String)request.getParameter("pr"+i);
            cant[i] = (String)request.getParameter("cantidad"+i);
            sesion.setAttribute("pr" + i, prod[i]); // Estableciendo el checkbox marcado
            sesion.setAttribute("cantidad"+i, cant[i]); // Estableciendo la cantidad ingresada
        }
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
