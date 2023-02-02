package controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDao;
import model.Client;


/**
 * Servlet implementation class AjoutClient
 */
@WebServlet("/AjoutClient")
public class AjoutClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjoutClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String etape = request.getParameter("etape");
		
		
		switch (etape) {
		case "premiereSaisie":
			// récupérations des paramètres.
			String nom 			= request.getParameter("nom");
			String prenom 		= request.getParameter("prenom");
			String email 		= request.getParameter("email");
			String dateNaissance= request.getParameter("dateNaissance");
			String telephone 	= request.getParameter("telephone");
			String sexe 		= request.getParameter("sexe");
			String mdp 			= request.getParameter("mdp");
			String mdpCheck		= request.getParameter("mdpCheck");
			String pays 		= request.getParameter("pays");
			String langages[]   = request.getParameterValues("langages");
			String langagesString = "";
			for (String l : langages) {
				langagesString += l +", ";
			}
			langagesString = langagesString.substring(0, langagesString.length()-2);
			
			// construction de l'objet client
			Client client = new Client();
			client.setNom(nom);
			client.setPrenom(prenom);
			client.setEmail(email);
			client.setDateNaissance(dateNaissance);
			client.setTelephone(telephone);
			client.setSexe(sexe);
			client.setMdp(mdp);
			client.setPays(pays);
			client.setLangages(langagesString);
			
			// on "contexte" l'objet client
			this.getServletContext().setAttribute("clientSession", client);
			
			
			// vérificationMdp
			if (mdp.equals(mdpCheck) == false) {
				// les mdp ne correspondent pas, on redemande la saisie
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/pwdAgainForm.jsp").forward(request, response);
			} else {
				//les mdp correspondent, on affiche la vue de vérification
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/affichClientVerif.jsp").forward(request, response);
			}
			
			break;

			
		case "verificationMdp":
			Client clientSession = (Client) request.getServletContext().getAttribute("clientSession");
			mdp = request.getParameter("mdp");
			mdpCheck = request.getParameter("mdpCheck");
			
			if (mdp.equals(mdpCheck) == false) {
				// les mdp ne correspondent pas, on redemande la saisie
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/pwdAgainForm.jsp").forward(request, response);
			} else {
				//les mdp correspondent, on affiche la vue de vérification
				clientSession.setMdp(mdp);
				this.getServletContext().getRequestDispatcher("/WEB-INF/views/affichClientVerif.jsp").forward(request, response);
			}
			break;
			
		case "enregistrementClient":
			clientSession = (Client) request.getServletContext().getAttribute("clientSession");
			ClientDao cd = new ClientDao();
			cd.addClient(clientSession);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/affichClientInscrit.jsp").forward(request, response);
			break;
		}

	}
}
