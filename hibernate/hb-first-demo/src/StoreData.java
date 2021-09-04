import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class StoreData {
	public static void main(String[] args) {

		// Create typesafe ServiceRegistry object
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		// Create an employee
		System.out.println("Create a new employee");
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setFirstName("Gaurav");
		e1.setLastName("Chawla");

		session.save(e1); // inserting emp object into emmp1000 table
		System.out.println("Employee successfully saved");

		// List all employees
		System.out.println("List All Employees");
		// select * from Employee 
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.list();
		for (Employee e : employees) {
			System.out.println(e);
		}

		// List emp based on id
		System.out.println("List Employee Based on Id");
		Employee employee = session.get(Employee.class, 102);
		System.out.println(employee);
		
		// Update emp last name based on id
		System.out.println("Update Employee Last Name Based on Id");
		employee = session.get(Employee.class, 102);
		employee.setLastName("Chennai");
		System.out.println("Updated Successfully");
		System.out.println(employee);
		
		// Delete emp based on id
		System.out.println("Delete Employee Based on Id");
		employee = session.load(Employee.class, 101);
		session.delete(employee);
		System.out.println("Deleted Successfully");
		
		t.commit(); // permanent save
		factory.close();
		session.close();

	}
}
