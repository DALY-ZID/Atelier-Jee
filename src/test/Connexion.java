package test;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
        User.add(new User("Saleh", "Saleh"));
        User.add(new User("Daly", "Daly"));
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out = response.getWriter();
		
		String login = request.getParameter("login");
		String password = request.getParameter ("password");
		User user  = new User(login, password);
		if (User.exist(user)) 
            response.sendRedirect("Accueil.html");
        else 
            out.println("Error: User not found");			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String login = request.getParameter("login");
		String password = request.getParameter ("password");
		User user  = new User(login, password);
		if (User.exist(user)) 
            response.sendRedirect("Accueil.html");
        else 
            out.println("Error: User not found");		
	}
}
