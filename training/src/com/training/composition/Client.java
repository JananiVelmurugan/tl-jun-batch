package com.training.composition;

public class Client {

	public static void main(String[] args) {

		Project project = new Project();
		project.setId(1000);
		project.setName("BankingDomain");
		
		Project project1 = new Project(2000,"TestingDomain");
		
		Employee employee1 = new Employee();
		employee1.setId(10);
		employee1.setName("TestLeaf");
		employee1.setProject(project);
		
		Employee employee2 = new Employee();
		employee2.setId(20);
		employee2.setName("LeafTest");
		employee2.setProject(project1);
		
		System.out.println(employee1.print());
		System.out.println(employee2.print());
		
		
	}

}
