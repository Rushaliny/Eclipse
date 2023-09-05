package Jobseeker;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		 String firstname = request.getParameter("firstname");
	        String lastname = request.getParameter("lastname");
	        String gender = request.getParameter("gender");
	        String state = request.getParameter("state");
	        String city = request.getParameter("city");
	        String dob = request.getParameter("dob");
	        String pincode = request.getParameter("pincode");
	        String course = request.getParameter("course");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");

	        // Create a User object
	        RegisterBean user = new RegisterBean();
	        user.setFirstname(firstname);
	        user.setLastname(lastname);
	        user.setGender(gender);
	        user.setState(state);
	        user.setCity(city);
	        user.setDob(dob);
	        user.setPincode(pincode);
	        user.setCourse(course);
	        user.setEmail(email);
	        user.setPassword(password);

	        // Create a RegisterDAO instance and call the insertUser method
	        RegisterDAO registerDAO = new RegisterDAO();
	        boolean registrationSuccessful = registerDAO.insert(registerDAO);

	        if (registrationSuccessful) {
	            // Redirect to a success page
	            response.sendRedirect("login.jsp");
	        } else {
	            // Redirect to an error page
	            response.sendRedirect("register.jsp");
	        }
	    
	}

	}


