package com.training.oops.product;

public class Product {

	public int id;
	private String name;
	private double cost;

//	public int getId() {
//		return id;
//	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
