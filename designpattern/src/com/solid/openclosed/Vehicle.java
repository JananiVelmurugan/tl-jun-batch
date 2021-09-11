package com.solid.openclosed;

public class Vehicle {

	// violates open-closed principle
//	public double vehicleNumber(VehicleInfo vi) {
//		if (vi instanceof Car) {
//			return vi.getNumber();
//		}
//		if (vi instanceof Bike) {
//			return vi.getNumber();
//		}
//		if (vi instanceof Truck) {
//			return vi.getNumber();
//		}
//		return 0;
//	}

	// implements open-closed principle

	public double vehicleNumber() {
		return 0;
	}
}
