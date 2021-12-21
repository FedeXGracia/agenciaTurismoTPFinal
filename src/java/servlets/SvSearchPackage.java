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
import logica.Controller;
import logica.TouristPackage;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvSearchPackage", urlPatterns = {"/SvSearchPackage"})
public class SvSearchPackage extends HttpServlet {
    
    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<TouristPackage> tourPackagesList = control.getTourPackages();
        HttpSession mySession = request.getSession();
        mySession.setAttribute("tourPackagesList", tourPackagesList);
        response.sendRedirect("mostrar_paquetes.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        TouristPackage tP = control.searchTouristPackage(id);

        if (tP != null) {
            HttpSession mySession = request.getSession();
            mySession.setAttribute("touristPackage", tP);
            response.sendRedirect("encontrado_paquete.jsp");
        } else {
            response.sendRedirect("buscar_paquetes.jsp");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
