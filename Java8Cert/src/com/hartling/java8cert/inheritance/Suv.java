package com.hartling.java8cert.inheritance;

public class Suv extends Vehicle {
	private float gasMileage = 20;
	private int seatingCapacity = 6;
	private boolean fourWheelDrive = true;

	private String serialNumber = "suv123abc";

	public static void main(String args[]) {

		Suv suv = new Suv();
		System.out.println("field suv.gasMileage = " + suv.gasMileage);
		System.out.println("field suv.getGasMileage = " + suv.getGasMileage());

		System.out.println("field suv.getSeatingCapacity = " + suv.getSeatingCapacity());
		System.out.println("field isFourWheelDrive = " + suv.isFourWheelDrive());

		Vehicle vehicle = new Suv();
		System.out.println();
		System.out.println("Parent");
		System.out.println("field gasMileage = " + vehicle.gasMileage);
		System.out.println("field gasMileage with cast to suv = " + ((Suv) vehicle).gasMileage);
		System.out.println("field getGasMileage = " + vehicle.getGasMileage());

		System.out.println("field getSeatingCapacity = " + vehicle.getSeatingCapacity());
		System.out.println("field isFourWheelDrive = " + vehicle.isFourWheelDrive());

		System.out.println();
		if (vehicle instanceof Vehicle) {
			System.out.println("it's a Parent");
		}

		if (vehicle instanceof Suv) {
			System.out.println("it's a Suv");
		}
		ArrayIndexOutOfBoundsException e;

		try {
			int divideByZero = 10 / 0;
		} catch (ArithmeticException ae) {

		}

		suv.addTwoNumbers(5, 4);
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

	private String getSerialNumber() {
		return serialNumber;
	}

	private void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}
