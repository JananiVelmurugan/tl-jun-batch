package com.training.command;

public class Subtract implements CommandInterface {

	int amount;
	
	public Subtract(int amount) {
		super();
		this.amount = amount;
	}

	@Override
	public void execute() {
		Counter.subtract( amount );
	}

	@Override
	public void undo() {
		Counter.add( amount );
	}

	@Override
	public String toString() {
		return "Subtract [amount=" + amount + "]";
	}

}
