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
@WebServlet(name = "SvSale", urlPatterns = {"/SvSale"})
public class SvSale extends HttpServlet {
    
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
        String payMethod = request.getParameter("payMethod");
        String saleDate = request.getParameter("saleDate");
        
        //Traigo la sesi{on y asigno los atributos para todas las sesiones
        request.getSession().setAttribute("payMethod", payMethod);
        request.getSession().setAttribute("saleDate", saleDate);
        
        //Me comunico con mi lógica
        control.createSale(payMethod, saleDate);

        //Armo mi response (respuesta)
        response.sendRedirect("alta_ventas.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
