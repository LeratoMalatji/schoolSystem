package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.redi.backend.School;

public class studentCreateTest {

	@Test
	public void test() {
		
System.out.println("S*************************ervlet called************************************************************************ ");
		
		org.redi.backend.Student student = new org.redi.backend.Student();
		org.redi.backend.ContactDetails con = new org.redi.backend.ContactDetails();
		org.redi.backend.Address address =new org.redi.backend.Address();
		
		
		student.setName("lerato");
		student.setSurname("malatji");
		student.setGender("male");
		student.setAge("22");
		student.setNationality("south african");
		student.setRace("black");
		
		System.out.println("###############################################started#########################creating");
		
		
		student.setPassword("ssdfsf");
			
		
		
		
		
		//********************************************************************************************
		con.setCellNumber("0847373737");
		con.setLandLine("01192992992");
		con.setEmail("leratomalatji@ymail.com");
		student.setContactDetails(con);
		
		//******************************************************************************************
	
		
		
		address.setCity("germiston");
		address.setProvence("gauteng");
		address.setStreet("ixia");
		address.setHouseNumber(222);
		address.setPostalCode("1401");
		
		
		student.setAddress(address);
		
		School school = new School();
		school.addStudent(student);
		
		
		
		System.out.println("###############################################complete#########################creating");
		//***********************************************************************************************************************
		
	}

}
