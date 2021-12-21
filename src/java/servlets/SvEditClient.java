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

/**
 *
 * @author FEDEX
 */
@WebServlet(name = "SvEditClient", urlPatterns = {"/SvEditClient"})
public class SvEditClient extends HttpServlet {
    
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
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String address = request.getParameter("address");
        String identification = request.getParameter("identification");
        String birthday = request.getParameter("birthday");
        String nationality = request.getParameter("nationality");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
                
        Client cli = control.searchClient(id);
        cli.setfName(fname);
        cli.setlName(lname);
        cli.setAddress(address);
        cli.setDni(identification);
        cli.setBornDate(birthday);
        cli.setNationality(nationality);
        cli.setPhoneNumber(phone);
        cli.setEmail(email);
                
        //Me comunico con mi lógica
        control.editClient(cli);
        
        //Actualizo mi lista de personas
        request.getSession().setAttribute("clientsList", control.getClients());
        
        //Armo mi response (respuesta)
        response.sendRedirect("mostrar_clientes.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo ID
        int id = Integer.parseInt(request.getParameter("id"));
        Client cli = control.searchClient(id);

        HttpSession mySession = request.getSession();
        mySession.setAttribute("client", cli);
        response.sendRedirect("modificar_cliente.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
