/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "SvClients", urlPatterns = {"/SvClients"})
public class SvClients extends HttpServlet {
    
    Controller control = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo los atributos del front
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        String identification = request.getParameter("identification");
        String birthday = request.getParameter("birthday");
        String nationality = request.getParameter("nationality");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        
        //Traigo la sesi{on y asigno los atributos para todas las sesiones
        request.getSession().setAttribute("fname", fname);
        request.getSession().setAttribute("lname", lname);
        request.getSession().setAttribute("address", address);
        request.getSession().setAttribute("identification", identification);
        request.getSession().setAttribute("birthday", birthday);
        request.getSession().setAttribute("nationality", nationality);
        request.getSession().setAttribute("phone", phone);
        request.getSession().setAttribute("email", email);

        //Me comunico con mi lógica
        control.createClient(fname, lname, address, identification, birthday,
                nationality, phone, email);

        //Armo mi response (respuesta)
        response.sendRedirect("alta_clientes.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
