package controleur;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulaire_inscrit
 */
@WebServlet("/Formulaire_inscrit")
public class Formulaire_inscrit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulaire_inscrit() {
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

		
		
		// récupérations des paramètres.
		String nom 				= request.getParameter("nom");
		String prenom 			= request.getParameter("prenom");
		String email 			= request.getParameter("email");
		String dateNaissance 	= request.getParameter("dateNaissance");	
		String telephone 		= request.getParameter("telephone");
		String sexe 			=(request.getParameter("radio_sexe").equals("sexeM") == true) ? "Homme" : "Femme";
		String mdp 				= request.getParameter("mdp");
		String pays 			= request.getParameter("pays");
		String langages[] 		= request.getParameterValues("langages");
		String langagesString 	= "";
		for (String l : langages) {
			langagesString += l +", ";
		}
		langagesString 			= langagesString.substring(0, langagesString.length()-2);
		
		
		
		
		
		
		
		
		// mise en place des attributs pour la vue.
		request.setAttribute("nom", 			nom);
		request.setAttribute("prenom", 			prenom);
		request.setAttribute("email", 			email);
		request.setAttribute("dateNaissance", 	dateNaissance);
		request.setAttribute("telephone", 		telephone);
		request.setAttribute("sexe", 			sexe);
		request.setAttribute("mdp", 			mdp);
		request.setAttribute("pays", 			pays);
		request.setAttribute("langages", 		langagesString);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/affichInscrit.jsp").forward(request, response);
		

		
		
		
		
	}

}
