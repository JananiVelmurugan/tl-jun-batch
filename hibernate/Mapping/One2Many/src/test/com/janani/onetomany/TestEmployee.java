package test.com.janani.onetomany;  

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.janani.onetomany.Employee;
import com.janani.onetomany.Department;

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
		Department department = employee.getDepartment();
		System.out.println("Department Id : " + department.getId());
		System.out.println("Department Name : " + department.getName());

		session.close();

	}
}
