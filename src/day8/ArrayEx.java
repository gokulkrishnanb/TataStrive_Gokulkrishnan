package day8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first size of an array");
		int a = sc.nextInt();

		System.out.println("Enter the Second size of an array");
		int b = sc.nextInt();

		int[] array1 = new int[a];
		int[] array2 = new int[b];
		if (a != b || a < 0 || b < 0) {
			System.out.println("invalid length");
		} else {
			for (int i = 0; i < array1.length; i++) {
				array1[i] = sc.nextInt();
			}

			for (int i = 0; i < array1.length; i++) {
				array2[i] = sc.nextInt();
			}
			int[] array3 = new int[array1.length];

			int total = 0;
			for (int i = 0; i < array1.length; i++) {
				array3[i] = array1[i] + array2[i];
				System.out.println(array3[i]);
				total += array3[i];
				

			}
			
			PrimeNumber2 p = new PrimeNumber2(total);
			System.out.println(p);

		}

	}
}
