package controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintNomPrenom
 */
@WebServlet("/PrintNomPrenom")
public class PrintNomPrenom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintNomPrenom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//récupérer le nom envoyé
	String nom =request.getParameter("nom");
	String prenom =request.getParameter("prenom");

	request.setAttribute("nom", nom);
	request.setAttribute("prenom", prenom);
	
	
	
	System.out.println(nom +" "+ prenom);
	
	//la vue qui affiche la réponse
	this.getServletContext().getRequestDispatcher("/WEB-INF/views/printNomPrenom.jsp").forward(request, response);
	}

}
