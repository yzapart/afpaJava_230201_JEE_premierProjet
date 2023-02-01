package controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Operation
 */
@WebServlet("/Operation")
public class Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Operation() {
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
		double a = Double.valueOf(request.getParameter("a"));
		double b = Double.valueOf(request.getParameter("b"));
		
		String operation = request.getParameter("ope");
		
		double res = 0;
		
		switch (operation) {
		case "addition":
			res = a + b;
			break;
		case "soustraction":
			res = a - b;
			break;
		case "multiplication":
			res = a * b;
			break;
		case "division":
			res = a / b;
			break;
		}
		
		request.setAttribute("aaa", a);
		request.setAttribute("bbb", b);
		request.setAttribute("resultat", res);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/affichRes.jsp").forward(request, response);
		
	}

}
