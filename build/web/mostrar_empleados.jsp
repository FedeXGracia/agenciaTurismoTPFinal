<%-- 
    Document   : mostrar_empleados
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

        <title>Visualización Empleados</title>

        <!--

        TemplateMo 548 Training Studio

        https://templatemo.com/tm-548-training-studio

        -->

        <!-- Additional CSS Files -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">

        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">

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
        <div class="table-responsive">
            <table class="table table-condensed table-bordered table-hover">
                <thead>
                    <tr style="text-align: center; background-color: orange">
                        <th>Empleado</th>
                        <th>Dirección</th>
                        <th>DNI</th>
                        <th>Nacimiento</th>
                        <th>Nacionalidad</th>
                        <th>Teléfono</th>
                        <th>Email</th>
                        <th>Cargo</th>
                        <th>Sueldo</th>
                        <th>Usuario</th>
                        <th>Contraseña</th>
                        <th colspan="2" style="background-color: greenyellow">Acción</th>
                    </tr>
                </thead>

                <tbody>


                    <%  HttpSession mySession = request.getSession();
                        List<Employee> employeesList = (List) request.getSession().getAttribute("employeesList");
                        for (Employee emp : employeesList) {
                    %>

                    <tr>  
                        <%String fullName = emp.getfName() + " " + emp.getlName();%>
                        <td><%=fullName%></td>
                        <%String address = emp.getAddress();%>
                        <td><%=address%></td>
                        <%String identification = emp.getDni();%>
                        <td><%=identification%></td>
                        <%String birthDay = emp.getBornDate();%>
                        <td><%=birthDay%></td>
                        <%String nationality = emp.getNationality();%>
                        <td><%=nationality%></td>
                        <%String phoneNumber = emp.getPhoneNumber();%>
                        <td><%=phoneNumber%></td>
                        <%String email = emp.getEmail();%>
                        <td><%=email%></td>
                        <%String charge = emp.getCharge();%>
                        <td><%=charge%></td>
                        <%double salary = emp.getSalary();%>
                        <td><%=salary%></td>
                        <%String user = emp.getUser().getUserName();%>
                        <td><%=user%></td>
                        <%String pass = emp.getUser().getPassword();%>
                        <td><%=pass%></td>

                        <%int id = emp.getUser().getUserId();%>
                        <td>
                            <form name="deleteEmployee" action="SvDeleteEmployee" method="POST" style="display: inline">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit" class="btn btn-danger btn-xs" data-title="Delete" style="display: inline">ELIMINAR</button>
                            </form>
                        </td>
                        <td>
                            <form name="editEmployee" action="SvEditEmployee" method="POST" style="display: inline">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit" class="btn btn-primary" data-title="Edit" style="display: inline">EDITAR</button>
                            </form>
                        </td>

                    </tr>

                    <%}%>
                </tbody>
            </table>
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

    </body>
</html>
