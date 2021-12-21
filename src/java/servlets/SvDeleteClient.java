package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controller;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvDeleteClient", urlPatterns = {"/SvDeleteClient"})
public class SvDeleteClient extends HttpServlet {
    
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
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        
        control.deleteClient(id);
        
        //Actualizo mi lista de Empleados
        request.getSession().setAttribute("clientsList", control.getClients());
        response.sendRedirect("mostrar_clientes.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
