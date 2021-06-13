package com.training.oops;

public class Item {
	private int id;
	private String name;
	private double cost;
	

	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Item(int id, String name, double cost) {
		this(id, name);
		this.cost = cost;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
