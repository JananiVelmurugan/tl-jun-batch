package com.janani.onetoone;    
   
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	private int empno;
	private String firstName;
	private String lastName;
	private Employee employeeDetails;

	@Id
	@GeneratedValue
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "personalDetails")
	public Employee getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(Employee employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

}
