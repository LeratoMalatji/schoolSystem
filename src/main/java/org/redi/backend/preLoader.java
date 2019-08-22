package org.redi.backend;

import java.util.ArrayList;
import java.util.List;

public class preLoader {
	
	
	public static List<Module> loadModule()
	{
		List<Module> les = new ArrayList<Module>();
		les.add(new Module(55423,"software development",7000,1));
		les.add(new Module(55444,"computer skills",7000,1));
		les.add(new Module(55435,"english",7000,1));
		les.add(new Module(55451,"maths",7000,1));
		les.add(new Module(54537,"engeneering",7000,1));
		les.add(new Module(55463,"java",7000,1));
		les.add(new Module(55476,"afrikaans",7000,1));
		les.add(new Module(58483,"research",7000,1));
		les.add(new Module(57413,"database",7000,1));
		
		return les;
	}
	
	
	public static List<Course> loadCourse()
	{
		
		List<Course> lisCourse = new ArrayList<Course>();
		
		lisCourse.add(new Course(33443,"Computer Science",4,500));
		lisCourse.add(new Course(54535,"Graphic design",3,333));
		lisCourse.add(new Course(44443,"Economics",3,500));
		lisCourse.add(new Course(54365,"Accounting",4,500));
		lisCourse.add(new Course(74467,"information System",3,7050));
		lisCourse.add(new Course(94739,"Phycology",3,500));
		lisCourse.add(new Course(34444,"Biomedecine",4,280));
		
	return lisCourse;	
	}
	

}
