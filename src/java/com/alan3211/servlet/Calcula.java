package com.alan3211.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Calcula extends HttpServlet {

    private int precios[] = {
        25000, 29000, 12000, 8000, 9000, 2000, 3000, 14000, 8000, 2800, 7000, 10000
    };
    private int[] cantidadreal = new int[12];

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int total = 0;
        HttpSession sesion = request.getSession();
        String[] atributos = new String[12];
        String[] cant = new String[12];
        /*Estableciendo atributos*/
        for (int i = 0; i < atributos.length; i++) {
            atributos[i] = (String) request.getParameter("pr" + i);
            cant[i] = (String) request.getParameter("cantidad" + i);
            sesion.setAttribute("pr" + i, atributos[i]); // Estableciendo el checkbox marcado
            sesion.setAttribute("cantidad" + i, cant[i]); // Estableciendo la cantidad ingresada
        }
        convierte(cant);
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
                + "  <!--Encabezado-->\n"
                + "                       <header>\n"
                + "                               <div class=\"container\">\n"
                + "                                          <div class=\"row\">\n"
                + "                                               <img src=\"./img/logo.png\" alt=\"Logo\" class=\"img-responsive col-md-1\">\n"
                + "                                               <h1 class=\"col-md-11\">Ticket de Compra</h1>                                              \n"
                + "                                          </div>                                          \n"
                + "                                           <div class=\"row\">\n"
                + "                                                <p class=\"col-md-11\">Gracias por tu compra esperamos que hayas encontrado lo que necesitabas.</p>                                                                                         \n"                
                + "                                           </div>                                        \n"
                + "                               </div>\n"
                + "                       </header>"
                + "                <br>\n"
                + "        <!--Seccion Principal-->\n"
                + "        <div class=\"container\">                   \n"
                + "                        <section class=\"main row\">\n"
                + "                                    <div class=\"col-md-8 ticket\" style=\"left:450px;\">\n"
                + "                                                <p>Ticket de Compra</p>\n"
                + "                                                <p style=\"left:50px;\">Concepto    Precio</p>");
        if (atributos[0] == null && cantidadreal[0] == 1) {
        } else {
            out.println("<p>MAC OSX                                     $ " + precios[0] * cantidadreal[0] + "</p>");
            total += precios[0];
        }
        if (atributos[1] == null && cantidadreal[1] == 1) {
        } else {
            out.println("<p>Alienware                                   $" + precios[1] * cantidadreal[1] + "</p>");
            total += precios[1];
        }
        if (atributos[2] == null && cantidadreal[2] == 1) {
        } else {
            out.println("<p>HP Pavilion                                 $" + precios[2] * cantidadreal[2] + "</p>");
            total += precios[3];
        }
        if (atributos[3] == null && cantidadreal[3] == 1) {
        } else {
            out.println("<p>Samsung                                     $" + precios[3] * cantidadreal[3] + "</p>");
            total += precios[3];
        }
        if (atributos[4] == null && cantidadreal[4] == 1) {
        } else {
            out.println("<p>Lavadora Samsung                 $" + precios[4] * cantidadreal[4] + "</p>");
            total += precios[4];
        }
        if (atributos[5] == null && cantidadreal[5] == 1) {
        } else {
            out.println("<p>Licuadora Oster                        $" + precios[5] * cantidadreal[5] + "</p>");
            total += precios[5];
        }
        if (atributos[6] == null && cantidadreal[6] == 1) {
        } else {
            out.println("<p>Microondas LG                           $" + precios[6] * cantidadreal[6] + "</p>");
            total += precios[6];
        }
        if (atributos[7] == null && cantidadreal[7] == 1) {
        } else {
            out.println("<p>Refrigerador GE                          $" + precios[7] * cantidadreal[7] + "</p>");
            total += precios[7];
        }
        if (atributos[8] == null && cantidadreal[8] == 1) {
        } else {
            out.println("<p>Cajonera                                       $" + precios[8] * cantidadreal[8] + "</p>");
            total += precios[8];
        }
        if (atributos[9] == null && cantidadreal[9] == 1) {
        } else {
            out.println("<p>Repisa                                             $" + precios[9] * cantidadreal[9] + "</p>");

            total += precios[9];
        }
        if (atributos[10] == null && cantidadreal[10] == 1) {
        } else {
            out.println("<p>Sofa Deluxe                                 $" + precios[10] * cantidadreal[10] + "</p>");
            total += precios[10];
        }
        if (atributos[11] == null && cantidadreal[11] == 1) {
        } else {
            out.println("<p>Comedor simple                          $" + precios[11] * cantidadreal[11] + "</p>");
            total += precios[11];
        }
        out.println("                                    </div> ");
        if (total == 0) {
            out.println("<script>swal(\"No compraste nada :(\",\" \",\"error\")</script>");
        } else {
            out.println("<script>swal(\"Compra exitosa\",\" \",\"success\")</script>");
        }
        out.println("                        </section>\n"
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

    private void convierte(String[] cantidad) {
        for (int i = 0; i < cantidad.length; i++) {
            cantidadreal[i] = Integer.parseInt(cantidad[i]);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
