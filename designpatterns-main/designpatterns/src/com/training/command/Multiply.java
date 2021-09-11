package com.training.command;

public class Multiply implements CommandInterface {

	int amount;
	
	public Multiply(int amount) {
		super();
		this.amount = amount;
	}

	@Override
	public void execute() {
		Counter.multiply( amount );
	}

	@Override
	public void undo() {
		Counter.divide( amount );
	}

	@Override
	public String toString() {
		return "Multiply [amount=" + amount + "]";
	}

}
