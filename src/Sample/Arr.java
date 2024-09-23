package Sample;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the leanth of an Array");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + ",");
		}
		sc.nextLine();
		int middle = n / 2;
		if (middle % 2 != 0) {
			System.out.println("\n" + arr[middle] + "," + arr[middle - 1]);
		} else {
			System.out.println("\n" + arr[middle]);
		}

	}
}
