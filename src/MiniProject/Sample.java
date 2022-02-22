package MiniProject;

import java.util.Scanner;

public class Sample  {
	public static void main(String[] args) {
		System.out.println("Welcome for a nice Drive!");
		Scanner s = new Scanner(System.in);
		Driver peter = new Driver();
		peter.profile("peter");
		Car c;

		System.out.println("Want to Choose Car? "
				+ "Press 0 for NO / 1 for YES");
		int carType = s.nextInt();
		if (carType == 1) {
			System.out.println("Enter Car name");
			String carName = s.next();
			c = new Car(carName);
		} else {
			c = new Car();
		}

		c.GetInTheCar(peter);
		c.EnjobyBeverages();
	}
}
