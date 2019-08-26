package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.redi.backend.School;
import org.redi.backend.Student;

public class testNAmedQuarySelectById {

	@Test
	public void test() {
		
		
		Student s = new Student();
		s.setPassword("ssdfsf1");
		s.getContactDetails().setEmail("leratomalatji@ymail.com");
		School school = new School();
		school.getIdStudents(s);
		
		
		
	}

}
