package com.alan3211.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Electrodomestico extends HttpServlet {

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
            if (sesion.getAttribute("pr" + i) != null) {
                prod[i] = (String) sesion.getAttribute("pr" + i); //Obteniendo el checkbox del producto
                cant[i] = (String) sesion.getAttribute("cantidad" + i); //Obteniendo la cantidad asociada
            }
        }
        out.println("<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta name=\"author\" content=\"Alan Hernandez\">\n"
                + "        <meta name=\"description\" content=\"Tienda Virtual\">\n"
                + "        <meta name=\"keywords\" content=\"Tienda Virtual Alan WAD\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n"
                + "        <meta charset=\"UTF-8\">              \n"
                + "        <title>::::WAD-Store::::</title>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\"/>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/estilo.css\"/>\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap-theme.min.css\"/>        \n"
                + "        <script src=\"./js/jquery-2.2.3.min.js\"></script>\n"
                + "        <script src=\"js/Enviar.js\"></script>             \n"
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
                + "                                                <button class=\"col-md-1 btn btn-default\" type=\"button\" style=\"bottom:30px;\" onclick='javascript:Calcula()'>Checkout<span class=\"glyphicon glyphicon-log-out\"></span></button> \n"
                + "                                           </div>                                        \n"
                + "                               </div>\n"
                + "                       </header>"
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
                + "                                                    <li ><a href=\"javascript:enviarC()\">Computación  <span class=\"glyphicon glyphicon-phone\"></span></a></li>\n"
                + "                                                    <li class=\"active\"><a href=\"javascript:enviarE()\">Electrodomésticos  <span class=\"glyphicon glyphicon-lamp\"></span></a></li>\n"
                + "                                                    <li><a href=\"javascript:enviarM()\">Mueblería  <span class=\"glyphicon glyphicon-bed\"></span></a></li>\n"
                + "                                        </ul>     \n"
                + "                                     </div>\n"
                + "                                 </div>\n"
                + "                            </nav>\n"
                + "                </div>\n"
                + "            <br>\n"
                + "            <br>\n"
                + "            <br>                \n"
                + "                \n"
                + "        <!--Seccion Principal-->\n"
                + "       <div class=\"container\">                   \n"
                + "                        <section class=\"main row\">\n"
                + "                                    <form method=\"POST\" action=\"Calcula\" name=\"depa\">             \n"
                + "                                            <div class=\"col-md-3\">                         \n"
                + "                                                    <p>Lavadora Samsung</p>\n"
                + "                                                    <img src=\"./Electrodomestico/lavadorasamsung.jpg\" alt=\"Lavadora\" width=\"230\" height=\"175\">\n"
                + "                                                    <p>Llevate esta lavadora  para un lavado increíble</p>\n"
                + "                                                    <p>$9,000</p>\n"
                + "                                                    <label for=\"pr4\">Agregar</label>");
        if (prod[4] == null && cant[4] == null) {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr4\">");
            out.println(" <label for=\"cantidad4\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad4\" size=\"1\" value = \"1\">");
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr4\"checked>");
            out.println(" <label for=\"cantidad4\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad4\" size=\"1\" value = '" + cant[4] + "'>");
        }
        out.println("                             </div>\n"
                + "                                            <div class=\"col-md-3\">\n"
                + "                                                    <p>Licuadora Oster</p>\n"
                + "                                                      <img src=\"./Electrodomestico/licuadoraoster.jpg\" alt=\"Licuadora Oster\" width=\"230\" height=\"175\">\n"
                + "                                                       <p>Para realizar tus jugos  tu gusto</p>\n"
                + "                                                       <p>$2,000</p>\n"
                + "                                                       <label for=\"pr5\">Agregar</label>");
        if (prod[5] == null && cant[5] == null) {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr5\">");
            out.println(" <label for=\"cantidad5\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad5\" size=\"1\" value = \"1\">");
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr5\"checked>");
            out.println(" <label for=\"cantidad5\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad5\" size=\"1\" value = '" + cant[5] + "'>");
        }
        out.println("                                </div>\n"
                + "                                            <div class=\"col-md-3\">\n"
                + "                                                       <p>Microondas LG</p>\n"
                + "                                                      <img src=\"./Electrodomestico/microondaslg.jpg\" alt=\"Microondas\" width=\"230\" height=\"175\">\n"
                + "                                                       <p>Ideal para oficina o simplemente en casa</p>\n"
                + "                                                       <p>$3,000</p>\n"
                + "                                                       <label for=\"pr6\">Agregar</label>");
        if (prod[6] == null && cant[6] == null) {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr6\">");
            out.println(" <label for=\"cantidad6\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad6\" size=\"1\" value = \"1\">");
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr6\"checked>");
            out.println(" <label for=\"cantidad6\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad6\" size=\"1\" value = '" + cant[6] + "'>");
        }
        out.println("                               </div>\n"
                + "                                            <div class=\"col-md-3\">\n"
                + "                                                        <p>Refrigerador GE</p>\n"
                + "                                                      <img src=\"./Electrodomestico/refrige.jpg\" alt=\"Refrigerador GE\" width=\"230\" height=\"175\">\n"
                + "                                                       <p>Para guardar tus alimentos con ahorro de energia</p>\n"
                + "                                                       <p>$14,000</p>\n"
                + "                                                       <label for=\"pr7\">Agregar</label>");
        if (prod[7] == null && cant[7] == null) {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr7\">");
            out.println(" <label for=\"cantidad7\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad7\" size=\"1\" value = \"1\">");
        } else {
            out.println("<input type=\"checkbox\" class=\"checkbox checkbox-inline\" name=\"pr7\"checked>");
            out.println(" <label for=\"cantidad7\" class=\"control-label\">Cantidad</label>");
            out.println("<input type=\"text\" name=\"cantidad7\" size=\"1\" value = '" + cant[7] + "'>");
        }
        for (int i = 0; i < prod.length; i++) {
            if (i < 4 || i > 7) {
                if (prod[i] == null) {
                    out.println("<input type=\"checkbox\" name=\"pr" + i + "\">\n");
                    out.println("<input type=\"text\" name=\"cantidad" + i + "\" size=\"1\" value = \"1\">");
                } else {
                    out.println("<input type=\"checkbox\" name=\"pr" + i + "\" checked>\n");
                    out.println("<input type=\"text\" name=\"cantidad" + i + "\" size=\"1\" value = \"" + cant[i] + "\">");
                }
            } else {
                continue;
            }
        }
        out.println("                 </div>\n"
                + "<script>javascript:ocultaE()</script>"
                + "                            </form>  \n"
                + "                    </section>\n"
                + "        </div>\n"
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
                + "</html>"
        );
        /*Estableciendo atributos*/
        for (int i = 0; i < prod.length; i++) {
            prod[i] = (String) request.getParameter("pr" + i);
            cant[i] = (String) request.getParameter("cantidad" + i);
            sesion.setAttribute("pr" + i, prod[i]); // Estableciendo el checkbox marcado
            sesion.setAttribute("cantidad" + i, cant[i]); // Estableciendo la cantidad ingresada
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void rellenacantidad(String[] nomcan) {
        for (int i = 0; i < nomcan.length; i++) {
            nomcan[i] = "can" + i;
        }
    }
}
