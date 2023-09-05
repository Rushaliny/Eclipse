package Consultant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		   String email = request.getParameter("email");
	       String password = request.getParameter("password");
	       
	      
	    
	        // Initialize the DAO and database connection
	        loginDAO loginDAO = new loginDAO();

	        if (loginDAO.validateUser(email, password)) {
	            // Successful login, redirect to a success page
	        	System.out.println("Success");
	            response.sendRedirect("index.jsp");
	        } else {
	            // Failed login, redirect back to the login page with an error message
	        	System.out.println("error");
	            response.sendRedirect("test_login.jsp");
	        }
	}

}
