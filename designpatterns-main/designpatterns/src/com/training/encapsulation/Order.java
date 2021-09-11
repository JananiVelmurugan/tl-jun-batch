package com.training.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Order {
	List<Item> lineItems;
	String country = "";

	public Order() {
		lineItems = new ArrayList<Item>();
	}

	public double getOrderTotalBeforeMethodEncapsulation(Order order) {
	
		double total = 0;
		for (Item item : order.getLineItems()) {
			total += item.getPrice() * item.getQuantity();
			if (order.getCountry() == "US") {
				total += total * 0.07; // US sales tax
			}
			else if (order.country == "EU") {
				total += total * 0.20; // European VAT
			}
		}
		return total;

	}

	public double getOrderTotalAfterMethodEncapsulation(Order order) {

		double total = 0;
		for (Item item : order.getLineItems()) {
			total += item.getPrice() * item.getQuantity();
			total += total * getTaxRate(order.country);
			
		}
		return total;
	}

	public double getTaxRate(String country) {
		if (country == "US") {
			return 0.07; // US sales tax
		} else if (country == "EU") {
			return 0.20; // European VAT
		}
		return 0;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Item> getLineItems() {
		return lineItems;
	}
	
}
