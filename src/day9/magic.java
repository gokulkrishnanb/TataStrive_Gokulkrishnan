package day9;

import java.util.Scanner;

public class magic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = sc.nextInt();
		if (a < 1 || a > 6) {
			System.out.println("invalid number");
		} else {
			int[] array1 = new int[a];
			for (int i = 0; i < array1.length; i++) {
				array1[i] = sc.nextInt();
				primeNumber p = new primeNumber(array1[i]);
				System.out.println(p);
			}
			

		}
	}
}
