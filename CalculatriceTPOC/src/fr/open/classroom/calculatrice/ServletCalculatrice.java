package fr.open.classroom.calculatrice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculatrice
 */
@WebServlet("/ServletCalculatrice")
public class ServletCalculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculatrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/Calculatrice.jsp").forward(request, response);
    }
     
     
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	if (request.getParameter("valeur1").equals("") || request.getParameter("valeur2").equals("")) {
    		Operation operation = new Operation(0d, "+", 0d);
    		request.setAttribute("Operation", operation);
    	} else {
    		 Operation operation = new Operation(
	                Double.parseDouble(request.getParameter("valeur1")),
	                request.getParameter("operateur"),
	                Double.parseDouble(request.getParameter("valeur2"))
	         );
    		 request.setAttribute("Operation", operation);
    	}
    	
        
    
        this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/Calculatrice.jsp").forward(request, response);
    }
}
