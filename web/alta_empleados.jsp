<%-- 
    Document   : alta_employees
    Created on : 06/12/2021, 21:12:50
    Author     : FEDEX
--%>

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

        <title>Alta Empleados</title>

        <!--

        TemplateMo 548 Training Studio

        https://templatemo.com/tm-548-training-studio

        -->

        <!-- Additional CSS Files -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">

        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">

        <link rel="stylesheet" href="assets/css/templatemo-training-studio.css">

        <link rel="stylesheet" type="text/css" href="assets/css/menu.css">

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

        <!-- ***** Contact Us Area Starts ***** -->
        <section class="section" id="contact-us">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-xs-12">
                        <div id="map">
                            <!--iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3350.3229317597284!2d-68.84511155209361!3d-32.889629154556026!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x967e0907b3f6324b%3A0x501d1521958dfb21!2sPlaza%20Independencia!5e0!3m2!1ses!2sus!4v1638882357242!5m2!1ses!2sus" width="100%" height="750px" frameborder="0" style="border:0" allowfullscreen loading="lazy"></iframe-->
                            <image src="assets/images/Cordilleras.jpg" width="100%" frameborder="0" style="border:0" allowfullscreen loading="lazy"></image>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-xs-12">
                        <div class="contact-form">
                            <form id="contact" action="SvEmployee" method="POST">

                                <h6 style="background-color: #ffccff"><b>Ingrese los datos del EMPLEADO</b></h6>
                                <br>
                                <div class="row">
                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="fname" type="text" id="fname" placeholder="Ingrese NOMBRE" required="">
                                            <%Controller control = new Controller();%>
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="lname" type="text" id="lname" placeholder="Ingrese APELLIDO" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="address" type="text" id="address" placeholder="Ingrese DIRECCIÓN" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="identification" type="text" id="identification" placeholder="Ingrese DNI" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="birthday" type="text" id="birthday" placeholder="Ingrese NACIMIENTO (dd/mm/yyyy)" required="">
                                        </fieldset>
                                    </div>
                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="nationality" type="text" id="nationality" placeholder="Ingrese NACIONALIDAD" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="phone" type="number" id="phone" placeholder="Ingrese Nº TELÉFONO" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="email" type="text" id="email" pattern="[^ @]*@[^ @]*" placeholder="Ingrese EMAIL" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="charge" type="text" id="charge" placeholder="Ingrese CARGO" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="salary" type="text" id="salary" placeholder="Ingrese SUELDO" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="userName" type="text" id="userName" placeholder="Ingrese NOMBRE DE USUARIO" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <input name="password" type="password" id="password" placeholder="Ingrese PASSWORD" required="">
                                        </fieldset>
                                    </div>

                                    <div class="col-lg-12">
                                        <fieldset>
                                            <button type="submit" id="form-submit" class="main-button">REGISTRAR EMPLEADO</button>
                                        </fieldset>
                                    </div>

                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ***** Contact Us Area Ends ***** -->

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

    </body>
</html>
