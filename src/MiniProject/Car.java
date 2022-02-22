package MiniProject;

import java.util.Scanner;

 class Car {
	Driver driver;
	Beverages b;
	String carChoice;

	Car() {
		this.carChoice = "SUV";
	}

	Car(String carChoice) {
		this.carChoice = carChoice;
	}

	void GetInTheCar(Driver driver) {
		System.out.println("Hey " + driver.getName()
				+ " Enjoy driving with your " + this.carChoice + " Car");
		driver.drive();
	}

	void EnjobyBeverages() {
		System.out
				.println("Want Beverage?" + " Enter 1 for Tea/ 2 for Coffee!");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if (choice == 1) {
			b = new Tea();
		}
		if (choice == 2) {
			b = new Coffee();
		}

		b.getBeverage();
	}

}
