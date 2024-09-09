package day7;

import java.util.Scanner;

public class numberNames {
	

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		convertion c = new convertion(num);

		
		System.out.println(c.convert());
		

	}
}
