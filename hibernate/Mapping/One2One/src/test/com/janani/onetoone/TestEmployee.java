package test.com.janani.onetoone;   
    
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.janani.onetoone.Employee;
import com.janani.onetoone.Person;

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
		Person personalDetails = employee.getPersonalDetails();
		System.out.println("First Name : " + personalDetails.getFirstName());
		System.out.println("Last Name : " + personalDetails.getLastName());

		session.close();

	}
}
