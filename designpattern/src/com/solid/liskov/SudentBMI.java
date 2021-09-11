
package com.solid.liskov;

public class SudentBMI extends Student {

	public void setHeight(double h) {
		super.setHeight(h);
		//super.setWeight(h);
	}

	public void setWeight(double w) {
		super.setWeight(w);
		//super.setHeight(w);
	}
}
