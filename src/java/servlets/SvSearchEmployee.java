package servlets;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controller;
import logica.Employee;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvSearchEmployee", urlPatterns = {"/SvSearchEmployee"})
public class SvSearchEmployee extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Employee> employeesList = control.getEmployees();
        HttpSession mySession = request.getSession();
        mySession.setAttribute("employeesList", employeesList);
        response.sendRedirect("mostrar_empleados.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        Employee emp = control.searchEmployee(id);

        if (emp != null) {
            HttpSession mySession = request.getSession();
            mySession.setAttribute("employee", emp);
            response.sendRedirect("encontrado_empleado.jsp");
        } else {
            response.sendRedirect("buscar_empleados.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
