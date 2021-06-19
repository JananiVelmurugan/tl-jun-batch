package com.training.interfacedemo;

public class Vehicle implements Travel, Owner {

	@Override
	public void getSpeed() {
		System.out.println(100);
		// count = 100;
	}

	@Override
	public void getOwnerName() {
		System.out.println("TestLeaf");

	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		
	}

}
