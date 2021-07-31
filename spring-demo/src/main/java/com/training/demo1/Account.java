package com.training.demo1;

@Named("account")
public class Account {

	@Inject
	private Customer customer;

	public Account() {
		System.out.println("Acccount Cons");
	}

	public Account(Customer customer) {
		System.out.println("Account Param Cons");
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + "]";
	}

}
