package studServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.redi.backend.School;

//@WebServlet("/register")
public class studentServlet extends HttpServlet{
	
	final static Logger logger = Logger.getLogger(studentServlet.class);
	
	public void service(HttpServletRequest req , HttpServletResponse res)
	{
		
		logger.info("Getting  into the servlet");
		
		System.out.println("S*************************ervlet called************************************************************************ ");
		
		org.redi.backend.Student student = new org.redi.backend.Student();
		org.redi.backend.ContactDetails con = new org.redi.backend.ContactDetails();
		org.redi.backend.Address address =new org.redi.backend.Address();
		
		
		student.setName(req.getParameter("name").toLowerCase());
		student.setSurname(req.getParameter("surname").toLowerCase());
		student.setGender(req.getParameter("gender").toLowerCase());
		student.setAge(req.getParameter("age").toLowerCase());
		student.setNationality(req.getParameter("nationality").toLowerCase());
		student.setRace(req.getParameter("race").toLowerCase());
		System.out.println("###############################################started#########################creating");
		
		if (req.getParameter("password").equals(req.getParameter("psw-repeat")))
		{
			student.setPassword(req.getParameter("password"));
			
			
		}
		else
		{
			
			System.out.println("wrong password entered ");
			
		}
		
		
		
		//********************************************************************************************
		con.setCellNumber(req.getParameter("cellNumber"));
		con.setLandLine(req.getParameter("landLine"));
		con.setEmail(req.getParameter("email").toLowerCase());
		student.setContactDetails(con);
		
		//******************************************************************************************
	
		
		
		address.setCity(req.getParameter("town").toLowerCase());
		address.setProvence(req.getParameter("provence").toLowerCase());
		address.setStreet(req.getParameter("street").toLowerCase());
		address.setHouseNumber(Integer.parseInt(req.getParameter("houseNumber")));
		address.setPostalCode(req.getParameter("postalCode"));
		
		
		student.setAddress(address);
		
		School school = new School();
		school.addStudent(student);
		
		
		
		System.out.println("###############################################complete#########################creating");
		//***********************************************************************************************************************
	
		
		
	}
	
	
	

}
