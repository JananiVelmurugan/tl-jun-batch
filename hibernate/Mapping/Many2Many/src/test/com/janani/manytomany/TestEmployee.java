package test.com.janani.manytomany; 

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.janani.manytomany.Course;
import com.janani.manytomany.Employee;

public class TestEmployee {
	public static void main(String[] args) throws Exception {

		// Preparing Configuration Object
		Configuration cfg = new Configuration().configure();

		// Building SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();

		// Open a new Session
		Session session = factory.openSession();

		Employee employee = (Employee) session.load(Employee.class, Integer.parseInt(args[0]));

		System.out.println("User Name : " + employee.getUsername());

		List<Course> courses = employee.getCourses();
		for (Course c : courses) {
			System.out.println("Course Id : " + c.getId());
			System.out.println("Course Name : " + c.getName());
			System.out.println("Course Duration : " + c.getDuration());
		}

		session.close();

	}
}
