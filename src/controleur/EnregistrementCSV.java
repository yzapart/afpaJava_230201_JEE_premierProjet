package controleur;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnregistrementCSV
 */
@WebServlet("/EnregistrementCSV")
public class EnregistrementCSV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EnregistrementCSV() {
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

		
		// récupérations des paramètres.
		String nom 				= request.getParameter("nom");
		String prenom 			= request.getParameter("prenom");
		String email 			= request.getParameter("email");
		String dateNaissance 	= request.getParameter("dateNaissance");
		String telephone 		= request.getParameter("telephone");
		String sexe 			= request.getParameter("sexe");
		String mdp 				= request.getParameter("mdp");
		String pays 			= request.getParameter("pays");
		String langages 		= request.getParameter("langages");
		
		
		
		// enregistrement des infos dans un fichier
		// CSV header : nom, prenom, email, date, téléphone, sexe, mdp, pays, langages
		// CSV header : codeAgence,nom,adresse
//		try {
//			FileWriter fileWriter = new FileWriter("C:\\Users\\59013-42-16\\Desktop\\inscrits.csv");
//			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//			bufferedWriter.write(
//						nom + "," + 
//						prenom + "," + 
//						email + "," + 
//						dateNaissance + "," + 
//						telephone + "," + 
//						sexe+ "," + 
//						mdp + "," + 
//						pays + "," + 
//						langages
//						);
//			bufferedWriter.newLine();
//
//			System.out.println("try write new CSV ok");
//			
//			bufferedWriter.close();
//		} catch (IOException e) {
//			System.out.println("Error writing to file");
//		}
//		
		
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("email", email);
		request.setAttribute("dateNaissance", dateNaissance);
		request.setAttribute("telephone", telephone);
		request.setAttribute("sexe", sexe);
		request.setAttribute("mdp", mdp);
		request.setAttribute("pays", pays);
		request.setAttribute("langages", langages);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/affichEnregistrement.jsp").forward(request, response);
		
		
		
	}

}
