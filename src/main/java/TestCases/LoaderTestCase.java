package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.redi.backend.School;

public class LoaderTestCase {

	@Test
	public void test() {
		
		School s = new School();
		s.addModules();
		
	}

}
