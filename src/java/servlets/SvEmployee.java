package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controller;
import sun.java2d.pipe.SpanShapeRenderer.Simple;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvEmployee", urlPatterns = {"/SvEmployee"})
public class SvEmployee extends HttpServlet {

    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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

        //Traigo la sesi{on y asigno los atributos para todas las sesiones
        request.getSession().setAttribute("fname", fname);
        request.getSession().setAttribute("lname", lname);
        request.getSession().setAttribute("address", address);
        request.getSession().setAttribute("identification", identification);
        request.getSession().setAttribute("birthday", birthday);
        request.getSession().setAttribute("nationality", nationality);
        request.getSession().setAttribute("phone", phone);
        request.getSession().setAttribute("email", email);
        request.getSession().setAttribute("charge", charge);
        request.getSession().setAttribute("salary", salary);
        request.getSession().setAttribute("userName", userName);
        request.getSession().setAttribute("password", password);

        //Me comunico con mi lógica
        control.createEmployee(fname, lname, address, identification, birthday,
                nationality, phone, email, charge, salary, userName, password);

        //Armo mi response (respuesta)
        response.sendRedirect("alta_empleados.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
