package servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SvEditPackage", urlPatterns = {"/SvEditPackage"})
public class SvEditPackage extends HttpServlet {
    
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
        Double packageCost = Double.parseDouble(request.getParameter("packageCost"));
                        
        TouristPackage tP = control.searchTouristPackage(id);
        tP.setPackageCost(packageCost);
                
        //Me comunico con mi lógica
        control.editTouristPackage(tP);
        
        //Actualizo mi lista de personas
        request.getSession().setAttribute("tourPackagesList", control.getTourPackages());
        
        //Armo mi response (respuesta)
        response.sendRedirect("mostrar_paquetes.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        TouristPackage tP = control.searchTouristPackage(id);

        HttpSession mySession = request.getSession();
        mySession.setAttribute("touristPackage", tP);
        response.sendRedirect("modificar_paquete.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
