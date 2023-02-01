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
@WebServlet("/PrintSum")
public class PrintSum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintSum() {
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
	String a = request.getParameter("a");
	String b = request.getParameter("b");

	
	int somme = Integer.valueOf(a) + Integer.valueOf(b) ;
	
	request.setAttribute("aaa", a);
	request.setAttribute("bbb", b);
	request.setAttribute("somme", somme);
	
	System.out.println("somme : " + somme);
	
	//la vue qui affiche la réponse
	this.getServletContext().getRequestDispatcher("/WEB-INF/views/sum.jsp").forward(request, response);
	}

}
