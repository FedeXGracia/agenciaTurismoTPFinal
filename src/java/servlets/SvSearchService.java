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
import logica.TouristService;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvSearchService", urlPatterns = {"/SvSearchService"})
public class SvSearchService extends HttpServlet {
    
    Controller control = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<TouristService> tourServicesList = control.getTourServices();
        HttpSession mySession = request.getSession();
        mySession.setAttribute("tourServicesList", tourServicesList);
        response.sendRedirect("mostrar_servicios.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        TouristService tS = control.searchTouristService(id);

        if (tS != null) {
            HttpSession mySession = request.getSession();
            mySession.setAttribute("touristService", tS);
            response.sendRedirect("encontrado_servicio.jsp");
        } else {
            response.sendRedirect("buscar_servicios.jsp");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
