<%-- 
    Document   : buscar_empleados
    Created on : 06/12/2021, 21:12:50
    Author     : FEDEX
--%>

<%@page import="logica.User"%>
<%@page import="java.util.List"%>
<%@page import="logica.Employee"%>
<%@page import="logica.Controller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

        <title>Buscar Empleado</title>

        <!--

        TemplateMo 548 Training Studio

        https://templatemo.com/tm-548-training-studio

        -->

        <!-- Additional CSS Files -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">

        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">

        <link rel="stylesheet" type="text/css" href="assets/css/style-search.css">

        <link rel="stylesheet" href="assets/css/templatemo-training-studio.css">
        
        <link rel="stylesheet" type="text/css" href="assets/css/menu.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>    


    </head>

    <body>

        <!-- ***** Preloader Start ***** -->
        <div id="js-preloader" class="js-preloader">
            <div class="preloader-inner">
                <span class="dot"></span>
                <div class="dots">
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
            </div>
        </div>
        <!-- ***** Preloader End ***** -->

        <!-- ***** Header Area Start ***** -->
        <header class="header-area header-sticky">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav class="main-nav">
                            <!-- ***** Logo Start ***** -->
                            <a href="index.jsp" class="logoOthers"><em>cuyo</em> tour</a>
                            <!-- ***** Logo End ***** -->
                            <!-- ***** Menu Start ***** -->
                            <ul class="nav">

                                <li class="scroll-to-section"><a href="">BÚSQUEDAS</a>
                                    <ul>
                                        <li class="color"><a href="buscar_empleados.jsp">Empleados</a></li>
                                        <li class="color"><a href="buscar_clientes.jsp">Clientes</a></li>
                                        <li class="color"><a href="buscar_ventas.jsp">Ventas</a></li>
                                        <li class="color"><a href="buscar_servicios.jsp">Servicio</a></li>
                                        <li class="color"><a href="buscar_paquetes.jsp">Paquetes</a></li>
                                        <li class="color"></li>
                                    </ul>
                                </li>
                                <li class="scroll-to-section"><a href="">LISTAS</a>
                                    <ul>
                                        <li class="color"><a href="SvSearchEmployee">Empleados</a></li>
                                        <li class="color"><a href="SvSearchClient">Clientes</a></li>
                                        <li class="color"><a href="SvSearchSale">Ventas</a></li>
                                        <li class="color"><a href="SvSearchService">Servicio</a></li>
                                        <li class="color"><a href="SvSearchPackage">Paquetes</a></li>
                                        <li class="color"></li>
                                    </ul>
                                </li>
                                <li class="scroll-to-section"><a href="">ALTAS</a>
                                    <ul>
                                        <li class="color"><a href="alta_empleados.jsp">Empleados</a></li>
                                        <li class="color"><a href="alta_clientes.jsp">Clientes</a></li>
                                        <li class="color"><a href="alta_ventas.jsp">Ventas</a></li>
                                        <li class="color"><a href="alta_servicios.jsp">Servicio</a></li>
                                        <li class="color"><a href="alta_paquetes.jsp">Paquetes</a></li>
                                        <li class="color"></li>
                                    </ul>
                                </li>

                                <!--li class="scroll-to-section"><a href="#contact-us" class="active">Contacto</a></li--> 
                                <li class="main-button"><a href="index.jsp" style="color:white!important">Inicio</a></li>
                            </ul>        
                            <a class='menu-trigger'>
                                <span>Menu</span>
                            </a>
                            <!-- ***** Menu End ***** -->
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- ***** Header Area End ***** -->

        <br>
        <br>
        <br>
        <br>
        <div class ="container search">
            <form class="form" action="SvSearchEmployee" method="POST">
                <input class="form-control" type="text" name="id" placeholder="Ingrese ID Empleado" required="">
                <input class="btn btn-outline-success" type="submit" value="Buscar por ID">
            </form>
        </div>
        
        <!-- ***** Footer Start ***** -->        
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <p>Copyright &copy; 2021 CuyoTour

                            - Designed by <a rel="nofollow" class="tm-text-link" target="_parent">FedeXMar</a></p>

                    </div>
                </div>
            </div>
        </footer>

        <!-- jQuery -->
        <script src="assets/js/jquery-2.1.0.min.js"></script>

        <!-- Bootstrap -->
        <script src="assets/js/popper.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>

        <!-- Plugins -->
        <script src="assets/js/scrollreveal.min.js"></script>
        <script src="assets/js/waypoints.min.js"></script>
        <script src="assets/js/jquery.counterup.min.js"></script>
        <script src="assets/js/imgfix.min.js"></script> 
        <script src="assets/js/mixitup.js"></script> 
        <script src="assets/js/accordions.js"></script>

        <!-- Global Init -->
        <script src="assets/js/custom.js"></script>       

        <!-- Search -->
        <script src="assets/js/search.js"></script> 

    </body>
</html>
