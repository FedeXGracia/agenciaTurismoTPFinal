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
import logica.Sale;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvEditSale", urlPatterns = {"/SvEditSale"})
public class SvEditSale extends HttpServlet {
    
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
        String payMethod = request.getParameter("payMethod");
        String saleDate = request.getParameter("saleDate");
                
        Sale sale = control.searchSale(id);
        
        sale.setPayMethod(payMethod);
        sale.setSaleDate(saleDate);
                
        //Me comunico con mi lógica
        control.editSale(sale);
        
        //Actualizo mi lista de personas
        request.getSession().setAttribute("salesList", control.getSales());
        
        //Armo mi response (respuesta)
        response.sendRedirect("mostrar_ventas.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        Sale sale = control.searchSale(id);

        HttpSession mySession = request.getSession();
        mySession.setAttribute("sale", sale);
        response.sendRedirect("modificar_venta.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
