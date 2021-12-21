<%-- 
    Document   : alta_servicio
    Created on : 19/12/2021, 01:36:51
    Author     : FEDEX
--%>

<%@page import="logica.Controller"%>
<%@page import="logica.TouristService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

        <title>Alta Servicios</title>

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
                            <image src="assets/images/Cordilleras.jpg" width="100%" frameborder="0" style="border:0" allowfullscreen loading="lazy"></image>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-xs-12">
                        <div class="contact-form">
                            <form id="contact" action="SvService" method="POST">

                                <%
                                    TouristService tS = new TouristService();
                                %>

                                <h6 style="background-color: #99ffcc"><b>Ingrese los datos del SERVICIO</b></h6>
                                
                                <br>
                                <li style="color:white; background-color: #F9735B">
                                    <ul>
                                        <li>- <b>Hotel</b>: Noche de Hotel - Costo: $1000</li>
                                        <li>- <b>Auto</b>: Alquiler de auto - Costo: $2000</li>
                                        <li>- <b>Colectivo</b>: Pasajes de colectivo - Costo: $3000</li>
                                        <li>- <b>Avión</b>: Pasajes de avión - Costo: $4000</li>
                                        <li>- <b>Tren</b>: Pasajes de tren - Costo: $3500</li>
                                        <li>- <b>Excursiones</b>: Salidas - Costo: $1500</li>
                                        <li>- <b>Entradas</b>: Entradas a eventos - Costo: $500</li>
                                    </ul>
                                </li>
                                <br>
                                
                                <div class="row">

                                    <div class="col-md-6 col-sm-12">    
                                        <fieldset>
                                            <!--input name="name" type="text" id="name" placeholder="Ingrese NOMBRE del Servicio" required=""-->
                                            <select id="name" name="name">
                                                <option value="0">Seleccione NOMBRE</option>
                                                <option value="Hotel">Hotel</option>
                                                <option value="Auto">Auto</option>
                                                <option value="Colectivo">Colectivo</option>
                                                <option value="Avion">Avión</option>
                                                <option value="Tren">Tren</option>
                                                <option value="Excuriones">Excursiones</option>
                                                <option value="Entradas">Entradas</option>
                                            </select>
                                            <%Controller control = new Controller();%>
                                        </fieldset>
                                    </div>
                                           
                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>        
                                            <!--input name="briefDescription" type="text" id="briefDescription" placeholder="Ingrese DESCRIPCIÓN" required=""-->
                                            <select id="briefDescription" name="briefDescription">
                                                <option value="0">Seleccione DESCRIPCIÓN</option>
                                                <option value="Noche de Hotel">Noche de Hotel</option>
                                                <option value="Alquiler de auto">Alquiler de auto</option>
                                                <option value="Pasajes de colectivo">Pasajes de colectivo</option>
                                                <option value="Pasajes de Avion">Pasajes de avión</option>
                                                <option value="Pasajes de Tren">Pasajes de tren</option>
                                                <option value="Excursiones">Excursiones</option>
                                                <option value="Entradas para Eventos">Entradas para eventos</option>
                                            </select>
                                        </fieldset>
                                    </div>
                                    
                                    <br>
                                    <br>
                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <!--input name="serviceDestiny" type="text" id="serviceDestiny" placeholder="Ingrese DESTINO" required=""-->
                                            <select id="serviceDestiny" name="serviceDestiny">
                                                <option value="0">Seleccione DESTINO</option>
                                                <option value="Mendoza">Mendoza</option>
                                                <option value="Misiones">Misiones</option>
                                                <option value="Buenos Aires">Buenos Aires</option>
                                                <option value="Cordoba">Córdoba</option>
                                                <option value="Santa Cruz">Santa Cruz</option>
                                                <option value="Tierra del Fuego">Tierra del Fuego</option>
                                                <option value="Jujuy">Jujuy</option>
                                            </select>
                                        </fieldset>
                                    </div>

                                    <div class="col-md-6 col-sm-12">
                                        <fieldset>
                                            <!--input name="serviceCost" type="text" id="serviceCost" placeholder="Ingrese COSTO" required=""-->
                                            <select id="serviceCost" name="serviceCost">
                                                <option value="0">Seleccione PRECIO</option>
                                                <option value="1000">$1000 - Hotel</option>
                                                <option value="2000">$2000 - Auto</option>
                                                <option value="3000">$3000 - Colectivo</option>
                                                <option value="4000">$4000 - Avión</option>
                                                <option value="3500">$3500 - Tren</option>
                                                <option value="1500">$1500 - Excursiones</option>
                                                <option value="500">$500 - Entradas</option>
                                            </select>
                                        </fieldset>
                                    </div>
                                    
                                    <br>
                                    <br>
                                    <div class="col-md-12 col-sm-12">
                                        <fieldset>
                                            <input name="serviceDate" type="text" id="serviceDate" placeholder="Ingrese FECHA de contratación de servicio (dd/mm/yyyy)" required="">
                                        </fieldset>
                                    </div>
                                      
                                    <br>
                                    <br>
                                    <br>
                                    <br>
                                    <div class="col-lg-12">
                                        <fieldset>
                                            <button type="submit" id="form-submit" class="main-button">REGISTRAR SERVICIO</button>
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
