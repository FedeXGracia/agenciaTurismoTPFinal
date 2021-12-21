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
import logica.Sale;

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvSearchSale", urlPatterns = {"/SvSearchSale"})
public class SvSearchSale extends HttpServlet {
    
    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Sale> salesList = control.getSales();
        HttpSession mySession = request.getSession();
        mySession.setAttribute("salesList", salesList);
        response.sendRedirect("mostrar_ventas.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        Sale sale = control.searchSale(id);

        if (sale != null) {
            HttpSession mySession = request.getSession();
            mySession.setAttribute("sale", sale);
            response.sendRedirect("encontrado_venta.jsp");
        } else {
            response.sendRedirect("buscar_ventas.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
