package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controller;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvUser", urlPatterns = {"/SvUser"})
public class SvUser extends HttpServlet {
    
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
        
        String user = request.getParameter("userName");
        String pass = request.getParameter("password");
        
        boolean authorized = control.checkUser(user, pass);
        
        if(authorized == true) {
            //Obtengo la sesión y le asigno el usuario y contraseña para validar
            HttpSession mySession = request.getSession(true);
            mySession.setAttribute("userName", user);
            mySession.setAttribute("password", pass);
            
            response.sendRedirect("index.jsp");
        }
        else {
            response.sendRedirect("login.jsp");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}