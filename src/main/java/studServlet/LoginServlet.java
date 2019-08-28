package studServlet;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.redi.backend.School;
import org.redi.backend.Student;
import org.redi.backend.preLoader;

import statuses.CurrentStatus;

@WebServlet("login")
public class LoginServlet extends HttpServlet implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(LoginServlet.class);
	
	
	static {
	
		// preloading modules to the database 
		
		School school = new School();
		school.addCourse();
		school.addModules();
		
	}
	
	
	
	public void doGet(HttpServletRequest req , HttpServletResponse res)
	{
		logger.info("Login servlets");
		Student student = new Student();
		
		
		student.getContactDetails().setEmail(req.getParameter("username"));
		student.setPassword(req.getParameter("password"));
		
		
		School school = new School();
		
		Student student1 = school.getIdStudents(student);
		
		if (student1.getStatus().equals(CurrentStatus.loggedin.name()))
		{
			logger.info("user is now logged in redirecting to the home page");
			
			
			try {
				
			HttpSession session = req.getSession();
			session.setAttribute("student", student1);
				
				res.sendRedirect("Bootslander/index.jsp");
				System.out.println("trying to call the home page#############################");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
