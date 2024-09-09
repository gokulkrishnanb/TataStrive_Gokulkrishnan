package day6;

import java.util.Scanner;

public class userInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID");
		int studentId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student Name");
		String studentName = sc.nextLine();
		System.out.println("Enter student Department");
		String department = sc.nextLine();
		System.out.println("Enter student Gender");
		String gender = sc.nextLine();
		System.out.println("Enter student category(Dayscholar or Hosteller)");
		String category = sc.nextLine();

		if (category.equals("Hosteller")) {

			System.out.println("Enter student College fees");
			double collegeFee = sc.nextDouble();
			System.out.println("Enter student room number");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter student Block name");
			char blockName = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Enter student's wants room type");
			String roomType = sc.nextLine();

			Student s = new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber,blockName, roomType);
			System.out.println(s);
		} else if (category.equals("Dayscholar")) {
			System.out.println("Enter student College fees");
			double collegeFee = sc.nextDouble();
			System.out.println("Enter the bus number");
			int busNumber = sc.nextInt();
			System.out.println("Enter the distance college to stop in km");
			int distance = sc.nextInt();

			Student s = new dayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber,
					distance);
			System.out.println("Total college fees :" + s.calculateTotalFee());
		}

	}

}
