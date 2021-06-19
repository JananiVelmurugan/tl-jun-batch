package com.training.composition;

public class Employee extends Object{
	private int id;
	private String name;
	private Project project;

	public Employee() {
	}

	public Employee(int id, String name, Project project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	String print() {
		return "id: " + id + ", name: " + name + ",project id: " + project.getId() + " project name: "
				+ project.getName();
	}
}
