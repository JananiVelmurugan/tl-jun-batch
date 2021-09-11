package com.training.command;

public class Add implements CommandInterface {

	int amount;
	
	public Add(int amount) {
		super();
		this.amount = amount;
	}

	@Override
	public void execute() {
		Counter.add( amount );
	}

	@Override
	public void undo() {
		Counter.subtract( amount );
	}

	@Override
	public String toString() {
		return "Add [amount=" + amount + "]";
	}

	

}
