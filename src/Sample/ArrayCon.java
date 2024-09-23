package Sample;

import java.util.Scanner;

//public class ArrayCon {
//	public static void main(String[] args) {
//		int[] values = new int[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < values.length; i++) {
//			values[i] = sc.nextInt();
//		}
//		int total = 0;
//		for (int sum : values) {
//			total += sum;
//		}
//		System.out.println(total);
//	}
//
//}

public class ArrayCon{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
	
		int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		for(int sum : arr) {
			 total += sum;
		}
		System.out.println(total);
	}
}