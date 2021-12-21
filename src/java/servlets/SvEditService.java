package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Client;
import logica.Controller;
import logica.TouristService;

@WebServlet(name = "SvEditService", urlPatterns = {"/SvEditService"})
public class SvEditService extends HttpServlet {
    
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
        String name = request.getParameter("name");
        String briefDescription = request.getParameter("briefDescription");
        String serviceDestiny = request.getParameter("serviceDestiny");
        Double serviceCost = Double.parseDouble(request.getParameter("serviceCost"));
        String serviceDate = request.getParameter("serviceDate");
                
        TouristService tS = control.searchTouristService(id);
        
        tS.setName(name);
        tS.setBriefDescription(briefDescription);
        tS.setServiceDestiny(serviceDestiny);
        tS.setServiceCost(serviceCost);
        tS.setServiceDate(serviceDate);
        
        //Me comunico con mi lógica
        control.editTouristService(tS);
        
        //Actualizo mi lista de personas
        request.getSession().setAttribute("tourServicesList", control.getTourServices());
        
        //Armo mi response (respuesta)
        response.sendRedirect("mostrar_servicios.jsp");        
                
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        TouristService tS = control.searchTouristService(id);

        HttpSession mySession = request.getSession();
        mySession.setAttribute("touristService", tS);
        response.sendRedirect("modificar_servicio.jsp");
               
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
