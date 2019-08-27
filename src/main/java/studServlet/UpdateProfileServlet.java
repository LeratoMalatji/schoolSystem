package studServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.redi.backend.School;
import org.redi.backend.Student;

@WebServlet("Bootslander/update")
public class UpdateProfileServlet extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse res)
	{
		HttpSession session = req.getSession();
		Student s = (Student)session.getAttribute("student");
		
		if (req.getParameter("ID")!=null )
		{
			s.setIDdoc(req.getParameter("ID"));
			
			School school = new School();
			school.updateStudent(s);
			
		}
		
		System.out.println("heloooooooooooo################################## ur ID");
		System.out.println(req.getParameter("ID"));
		
		
		
		
		
	}

}
