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
@WebServlet(name = "SvPackage", urlPatterns = {"/SvPackage"})
public class SvPackage extends HttpServlet {
    
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
        Double packageCost = Double.parseDouble(request.getParameter("packageCost"));
        
        //Traigo la sesi{on y asigno los atributos para todas las sesiones
        request.getSession().setAttribute("packageCost", packageCost);
        
        //Me comunico con mi lógica
        control.createTouristPackage(packageCost);

        //Armo mi response (respuesta)
        response.sendRedirect("alta_paquetes.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
