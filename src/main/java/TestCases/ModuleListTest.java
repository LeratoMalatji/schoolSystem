package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.redi.backend.School;

public class ModuleListTest {

	@Test
	public void test() {
		
		School school = new School();
		school.showModules();

		
	}

}
