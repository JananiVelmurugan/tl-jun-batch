package com.janani.onetoone;   
     
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Column(name="emp_no")
	private int empNo;
	
	private String username;
	private Person personalDetails;

	@Id
	@GeneratedValue
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empno")
	public Person getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(Person personalDetails) {
		this.personalDetails = personalDetails;
	}

}
