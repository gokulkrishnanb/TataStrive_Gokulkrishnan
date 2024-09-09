package day6;

import java.util.Scanner;

public class userInterfaceForshop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter your phone number");
		long number = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your street name");
		String streetName = sc.nextLine();
		System.out.println("Enter your bill amount");
		int amount = sc.nextInt();
		System.out.println("Enter your Distance");
		int distance = sc.nextInt();

		customerDetails cd = new customerDetails(name, number, streetName, amount, distance);
		System.out.println(cd);

	}

}
