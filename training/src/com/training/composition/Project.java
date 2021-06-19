package com.training.composition;

public class Project {
	private int id;
	private String name;
//	private Employee[] employees;

	public Project() {
		super();
	}

	public Project(int id, String name) {
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

}
