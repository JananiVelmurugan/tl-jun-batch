package com.training.lang;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private Department dept;

	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	String print() {
//		return id +" : "+ name;
//	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

//	@Override
//	public int hashCode() {
////		final int prime = 31;
////		int result = 1;
////		result = prime * result + id;
////		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return id + 20;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Manager extends Employee {

}
