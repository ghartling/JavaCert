package com.hartling.java8cert.inheritance;

public class Vehicle {
	private int seatingCapacity = 4;
	protected float gasMileage = 30;

	private boolean fourWheelDrive = false;

	private String serialNumber = "123abc";

	String testDefaultModifier = "default";

	public Vehicle() {
		System.out.println("vehicle contructor");
	}

	public int addTwoNumbers(int a, int b) {
		System.out.println("Parent: " + getClass().getSimpleName());
		return a + b;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public float getGasMileage() {
		return gasMileage;
	}

	public void setGasMileage(float gasMileage) {
		this.gasMileage = gasMileage;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	private String getSerialNumber() {
		return serialNumber;
	}

	private void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
