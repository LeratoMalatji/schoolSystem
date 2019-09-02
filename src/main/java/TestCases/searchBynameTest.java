package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.redi.backend.School;
import org.redi.backend.Student;

public class searchBynameTest {

	@Test
	public void test() {
		
		
		Student student =new Student();
		
		student.setName("andile");
	
		School school = new School();
		
		school.askToSearchUser(student);
		
		
	}
	
	
	
	
	
	
	
	

}
