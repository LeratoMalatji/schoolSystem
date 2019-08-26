package org.redi.backend;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import statuses.CurrentStatus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.*;

public class School {

	public Student getIdStudents(Student student) {
		Session session = HibernateUtil.getSessionFactory().openSession(); // session is an unit of work to perform
		// transactions are generally used to create boundaries when performing
		// different actions on a database.
		// so we can tell the database when we are done and can release a lock when it
		// is an update.
		// why use a transaction for readonly:
		// https://stackoverflow.com/questions/13539213/why-do-i-need-transaction-in-hibernate-for-read-only-operation

		// getting student email adddress
		String mail = student.getContactDetails().getEmail();
		//creating a new student
		Student studentInfo = new Student();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();

			// named quary to select a student from the database by address
			String sql = "SELECT * FROM students WHERE Email = :Email";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Student.class);
			query.setParameter("Email", mail);
			List<Student> results = query.list();

			// checkes if the List is empty if not the loop runs
			if (!results.isEmpty()) {

				// retriving the list of student result
				for (Student stud : results) {
					// checking if password is valid
					if (stud.getPassword().equals(student.getPassword())) {
						studentInfo = stud;

						studentInfo.setStatus(CurrentStatus.loggedin.name());
						System.out.println("corrent password");
						
					} else {// if password is not valid check status
						studentInfo.setStatus(CurrentStatus.incorrent_Password.name().toString());
						System.out.println("provided password is incorrect status id "+studentInfo.getStatus());
						

					}

				}

			} else {
				studentInfo.setStatus(CurrentStatus.Unregistered.name());
				System.out.println("############no such email address or username ################");

			}

			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close(); // must close session yourself
		}

		return studentInfo;
	}

	public void showStudents() {
		Session session = HibernateUtil.getSessionFactory().openSession(); // session is an unit of work to perform
		// transactions are generally used to create boundaries when performing
		// different actions on a database.
		// so we can tell the database when we are done and can release a lock when it
		// is an update.
		// why use a transaction for readonly:
		// https://stackoverflow.com/questions/13539213/why-do-i-need-transaction-in-hibernate-for-read-only-operation
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			// List<Student> students = session.createQuery("FROM Student").list(); //using
			// HQL
			List<Student> students = session.createCriteria(Student.class).list();
			System.out.println("\n----\n");
			for (final Student s : students) {
				System.out.println(s);
			}
			System.out.println("\n----\n");
			session.getTransaction().commit(); // flush happens automatically when a transaction is used
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close(); // must close session yourself
		}
	}

	public void showTeachers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			List<Teacher> teachers = session.createCriteria(Teacher.class).list();
			System.out.println("\n----\n");
			for (Teacher t : teachers) {
				System.out.println(t);
			}

			System.out.println("\n----\n");
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	// Returns a list of modules from Db
	public List<Module> showModules() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = null;

		List<Module> modules = new ArrayList<Module>();
		try {
			trans = session.beginTransaction();
			modules = session.createCriteria(Module.class).list();

			System.out.println("\n----\n");

			for (Module mod : modules) {

				System.out.println(mod);
			}
			System.out.println("\n----\n");

			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}

		return modules;
	}

	// get All courses from the database
	public void showCourses() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			List<Course> courses = session.createCriteria(Course.class).list();
			System.out.println("\n----\n");
			for (Course c : courses) {
				System.out.println(c);
			}
			System.out.println("\n----\n");

			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void showStudentWithNameLike(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			List<Student> students = session.createCriteria(Student.class)
					.add(Restrictions.like("name", "%" + name + "%")).list();
			System.out.println("\n----\n");
			for (Student s : students) {
				System.out.println(s);
			}

			System.out.println("\n----\n");

			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void askToSearchUser() {
		System.out.println("Enter name:");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		showStudentWithNameLike(name);
	}

	public void addCourse() {

		// System.out.println("Enter student name:");
		// Scanner in = new Scanner(System.in);
		// String name = in.nextLine();
		// Student student = new Student(name);

		for (Course course : preLoader.loadCourse()) {

			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction trans = null;
			try {
				trans = session.beginTransaction();
				// preferable to persist() than save(), as it is safer as changes are cascaded
				// to other tables and it can be
				// in a transaction

				Module module = new Module(0023, "Art", 7533.00, 2);
				Module modules = new Module(0026, "Art", 7533.00, 2);
				course.getModule().add(module);
				course.getModule().add(modules);

				session.persist(course);
				session.save(module);
				session.save(modules);

				session.getTransaction().commit();

				System.out.println("module saved ");

			} catch (RuntimeException e) {
				if (trans != null) {
					trans.rollback();
				}
				e.printStackTrace();
			} finally {
				session.close();
			}

		} //

	}

	public void addModules() {

		System.out.println("Enter student name:");
		Scanner in = new Scanner(System.in);
		// String name = in.nextLine();
		// Student student = new Student(name);

		for (Module module : preLoader.loadModule()) {

			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction trans = null;
			try {
				trans = session.beginTransaction();
				// preferable to persist() than save(), as it is safer as changes are cascaded
				// to other tables and it can be
				// in a transaction

				session.persist(module);

				session.getTransaction().commit();

				System.out.println("module saved ");

			} catch (RuntimeException e) {
				if (trans != null) {
					trans.rollback();
				}
				e.printStackTrace();
			} finally {
				session.close();
			}

		}

	}

	public boolean validateUser(Student student) {
		Student studentAthenticated = new Student();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Object obj = session.load(Student.class, new String(student.getContactDetails().getEmail()));

		if (obj != null) {
			studentAthenticated = (Student) obj;

			System.out.println(studentAthenticated.getContactDetails().getEmail());
			System.out.println(studentAthenticated.getPassword());

		} else {

			System.out.println("###########obj is == to null#############");
		}

		return true;
	}

	public void addStudent(Student student) {
		System.out.println("Enter student name:");
		Scanner in = new Scanner(System.in);
		// String name = in.nextLine();
		// Student student = new Student(name);

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			// preferable to persist() than save(), as it is safer as changes are cascaded
			// to other tables and it can be
			// in a transaction
			session.persist(student);

			session.getTransaction().commit();
			// changing status to saved if student has been successfully saved
			student.setStatus(CurrentStatus.Saved.name());

			System.out.println("Student saved");
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateStudent(Student student) {
		Transaction trans = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		boolean success = true;
		try {
			trans = session.beginTransaction();
			session.update(student); // assumes there is a row in the table! should check this normally!

			session.getTransaction().commit();
			System.out.println("Student updated");
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
		} finally {
			session.close();
		}
	}

	public void deleteStudent(int id) {
		Transaction trans = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trans = session.beginTransaction();
			Student student = (Student) session.load(Student.class, new Integer(id));
			session.delete(student);

			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void askToDeleteStudent() {
		showStudents();
		System.out.println("Enter id:");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		deleteStudent(id);
	}

	public void askToUpdateStudent() {
		showStudents();
		try {
			System.out.print("Enter id:");
			Scanner in = new Scanner(System.in);
			int id = in.nextInt();
			Scanner inText = new Scanner(System.in);
			System.out.print("Enter name:");
			String name = inText.nextLine();
			Student student = new Student(id, name);
			updateStudent(student);
		}
		// if a string is entered instead of a number for id
		catch (InputMismatchException i) {
			System.out.println("invalid id");
		}
	}

	// show the menu to select actions for our bank
	public void showMenu() {
		Scanner in = new Scanner(System.in);
		String answer = "";

		while (answer.equals("8") == false) {
			System.out.println("1. Show students");
			System.out.println("2. Search for student by name");
			System.out.println("3. Add new student");
			System.out.println("4. Update student");
			System.out.println("5. Delete student");
			System.out.println("6. Show teachers");
			System.out.println("7. Show Courses");
			System.out.println("8. Exit");

			System.out.print("Select an option:");
			answer = in.nextLine();

			if (answer.equals("1")) {
				showStudents();
			} else if (answer.equals("2")) {
				askToSearchUser();
			} else if (answer.equals("3")) {
				// addStudent();
			} else if (answer.equals("4")) {
				askToUpdateStudent();
			} else if (answer.equals("5")) {
				askToDeleteStudent();
			} else if (answer.equals("6")) {
				showTeachers();
			} else if (answer.equals("7")) {
				showCourses();
			}
		}
		// shouldnt be necessary to close session factory. It's a bug in Hibernate 4.3.
		// See
		// https://stackoverflow.com/questions/20976322/close-sessionfactory-in-hibernate-4-3
		HibernateUtil.closeSessionFactory();
	}

	public static void main(String[] args) {
		School school = new School();
		school.showMenu();
	}

}
