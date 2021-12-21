package servlets;

import java.io.IOException;
import java.util.Date;
//import java.io.PrintWriter;
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
@WebServlet(name = "SvEditEmployee", urlPatterns = {"/SvEditEmployee"})
public class SvEditEmployee extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));

        //Traigo los atributos del front
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        String identification = request.getParameter("identification");
        String birthday = request.getParameter("birthday");
        String nationality = request.getParameter("nationality");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String charge = request.getParameter("charge");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        Employee emp = control.searchEmployee(id);
        emp.setfName(fname);
        emp.setlName(lname);
        emp.setAddress(address);
        emp.setDni(identification);
        emp.setBornDate(birthday);
        emp.setNationality(nationality);
        emp.setPhoneNumber(phone);
        emp.setEmail(email);
        emp.setCharge(charge);
        emp.setSalary(salary);
        emp.getUser().setUserName(userName);
        emp.getUser().setPassword(password);
        
        //Me comunico con mi lógica
        control.editEmployee(emp);
        
        //Actualizo mi lista de personas
        request.getSession().setAttribute("employeesList", control.getEmployees());
        
        //Armo mi response (respuesta)
        response.sendRedirect("mostrar_empleados.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        Employee emp = control.searchEmployee(id);

        HttpSession mySession = request.getSession();
        mySession.setAttribute("employee", emp);
        response.sendRedirect("modificar_empleado.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
