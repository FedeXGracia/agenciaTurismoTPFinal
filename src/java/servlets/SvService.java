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
@WebServlet(name = "SvService", urlPatterns = {"/SvService"})
public class SvService extends HttpServlet {
    
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
        String name = request.getParameter("name");
        String briefDescription = request.getParameter("briefDescription");
        String serviceDestiny = request.getParameter("serviceDestiny");
        Double serviceCost = Double.parseDouble(request.getParameter("serviceCost"));
        String serviceDate = request.getParameter("serviceDate");
         
        //Traigo la sesi{on y asigno los atributos para todas las sesiones
        request.getSession().setAttribute("name", name);
        request.getSession().setAttribute("briefDescription", briefDescription);
        request.getSession().setAttribute("serviceDestiny", serviceDestiny);
        request.getSession().setAttribute("serviceCost", serviceCost);
        request.getSession().setAttribute("serviceDate", serviceDate);
        
        //Me comunico con mi lógica
        control.createTouristService(name, briefDescription, serviceDestiny, serviceCost, serviceDate);

        //Armo mi response (respuesta)
        response.sendRedirect("alta_servicios.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
