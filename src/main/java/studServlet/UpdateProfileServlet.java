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
		Student student = (Student)session.getAttribute("student");
		
		School school = new School();
		
		
		// check if the filds contain a input that the user has changed .
		if (req.getParameter("ID")!=null )
		{
			student.setIDdoc(req.getParameter("ID"));
	
		}
		if (req.getParameter("name")!=null )
		{
			student.setName(req.getParameter("name").toLowerCase());
			
		}
		if (req.getParameter("surname")!=null )
		{
			
			student.setSurname(req.getParameter("surname").toLowerCase());
		}
		if (req.getParameter("gender")!=null )
		{
			student.setGender(req.getParameter("gender").toLowerCase());
			
		}
		 if (req.getParameter("age")!=null )
		{
			student.setAge(req.getParameter("age").toLowerCase());	
			
		}
		if (req.getParameter("nationality")!=null )
		{
			
			student.setNationality(req.getParameter("nationality").toLowerCase());
			
		}
		if (req.getParameter("race")!=null )
		{
			
			
			student.setRace(req.getParameter("race").toLowerCase());
		}
		if (req.getParameter("cellNumber")!=null )
		{
			
			student.getContactDetails().setCellNumber(req.getParameter("cellNumber"));
			
		}
		if (req.getParameter("landLine")!=null )
		{
			
			student.getContactDetails().setCellNumber(req.getParameter("landLIne"));
			
		}
		if (req.getParameter("email")!=null )
		{
			
			student.getContactDetails().setCellNumber(req.getParameter("email"));
			
		}
		if (req.getParameter("town")!=null )
		{
			
			student.getAddress().setCity(req.getParameter("town"));
			
		}
		if (req.getParameter("provence")!=null )
		{
			
			student.getAddress().setCity(req.getParameter("provence"));
			
		}
		if (req.getParameter("street")!=null )
		{
			
			student.getAddress().setCity(req.getParameter("street"));
			
		}
		if (req.getParameter("houseNumber")!=null )
		{
			
			student.getAddress().setCity(req.getParameter("houseNumber"));
			
		}
		if (req.getParameter("postalCode")!=null )
		{
			
			student.getAddress().setCity(req.getParameter("postalCode"));
			
		}
		
		
		school.updateStudent(student);
		
		System.out.println("heloooooooooooo################################## ur ID");
		System.out.println(req.getParameter("ID"));
		
		
		
		
		
	}

}
