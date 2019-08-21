package com.hartling.java8cert.inheritance;

public class InstanceOfExample extends Vehicle {
	private boolean fourWheelDrive = true;

	public static void main(String args[]) {

		Vehicle vehicle = new InstanceOfExample();
		System.out.println();

		if (vehicle instanceof Vehicle) {
			System.out.println("it's a Parent");
		}

		if (vehicle instanceof InstanceOfExample) {
			System.out.println("it's a Suv");
		}
	}

	@Override
	public int addTwoNumbers(int a, int b) {
		System.out.println("Suv");
		super.addTwoNumbers(a, b);
		return a + b + 1;
	}

	@Override
	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	@Override
	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
}
