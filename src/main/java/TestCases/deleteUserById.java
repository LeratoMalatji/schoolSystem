package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.redi.backend.School;
import org.redi.backend.Student;

public class deleteUserById {

	@Test
	public void test() {
		
		Student student = new Student();
		student.setStudentID(22);
		
		School school = new School();
		
		school.askToDeleteStudent(student);
		
		
		
		
	}

}
