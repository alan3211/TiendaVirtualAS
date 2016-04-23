 function enviarC(){        
                document.depa.action = "/TiendaVirtualAS/Computacion"
                document.depa.submit();
            } 
            function enviarE(){
                document.depa.action = "/TiendaVirtualAS/Electrodomestico"
                document.depa.submit();
            }
              function enviarM(){
                document.depa.action = "/TiendaVirtualAS/Mueble"
                document.depa.submit();
            }
            
            function ocultaC(){
                 document.depa.pr4.style.visibility="hidden";
                 document.depa.pr5.style.visibility="hidden";
                 document.depa.pr6.style.visibility="hidden";
                 document.depa.pr7.style.visibility="hidden";
                 document.depa.pr8.style.visibility="hidden";
                 document.depa.pr9.style.visibility="hidden";
                 document.depa.pr10.style.visibility="hidden";
                 document.depa.pr11.style.visibility="hidden";
            }
            function ocultaE(){
                 document.depa.pr0.style.visibility="hidden";
                 document.depa.pr1.style.visibility="hidden";
                 document.depa.pr2.style.visibility="hidden";
                 document.depa.pr3.style.visibility="hidden";
                 document.depa.pr8.style.visibility="hidden";
                 document.depa.pr9.style.visibility="hidden";
                 document.depa.pr10.style.visibility="hidden";
                 document.depa.pr11.style.visibility="hidden";
            }
            function ocultaM(){
                 document.depa.pr0.style.visibility="hidden";
                 document.depa.pr1.style.visibility="hidden";
                 document.depa.pr2.style.visibility="hidden";
                 document.depa.pr3.style.visibility="hidden";
                 document.depa.pr4.style.visibility="hidden";
                 document.depa.pr5.style.visibility="hidden";
                 document.depa.pr6.style.visibility="hidden";
                 document.depa.pr7.style.visibility="hidden";
            }
            function Calcula(){
                  document.depa.action = "/TiendaVirtualAS/Calcula";
                  document.depa.submit();
            }


