package studServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.redi.backend.Student;


public class LoginServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest req , HttpServletResponse res)
	{
		
		Student student = new Student();
		
		
		student.getContactDetails().setEmail(req.getParameter("username"));
		student.setPassword(req.getParameter("password"));
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
