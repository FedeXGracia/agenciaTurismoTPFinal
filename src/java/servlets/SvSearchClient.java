package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Client;
import logica.Controller;
import logica.Employee;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvSearchClient", urlPatterns = {"/SvSearchClient"})
public class SvSearchClient extends HttpServlet {

    Controller control = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Client> clientsList = control.getClients();
        HttpSession mySession = request.getSession();
        mySession.setAttribute("clientsList", clientsList);
        response.sendRedirect("mostrar_clientes.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        Client cli = control.searchClient(id);

        if (cli != null) {
            HttpSession mySession = request.getSession();
            mySession.setAttribute("client", cli);
            response.sendRedirect("encontrado_cliente.jsp");
        } else {
            response.sendRedirect("buscar_clientes.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
