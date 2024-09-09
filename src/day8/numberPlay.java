package day8;

import java.util.Scanner;

public class numberPlay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if (num > 10 && num >= 50 && num < 100) {
			int firstNum =num/10;
			int SecondNum = num%10;
			int total = firstNum-SecondNum;
			System.out.println(total);
			
			
					

		} else if (num > 10 && num < 50) {
			
			int SecondNum = num%10;
			int firstNum =num/10;
			int total =SecondNum-firstNum;
			
			System.out.println(total);
		

		} else if (num >= 100 || num < 10) {

			System.out.println("invalid number");
		}

	}
}
