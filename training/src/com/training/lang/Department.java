package com.training.lang;

public class Department implements Cloneable {
	int id;
	String name;

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department() {
		super();
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {

		Department d1 = new Department(2001, "Dev");
		Department d2 = (Department) d1.clone();
		System.out.println(d1);
		System.out.println(d2);
	}
}
