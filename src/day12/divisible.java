package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		try{
			System.out.println("Enter the first Number");
		
		a=sc.nextInt();
		System.out.println("Enter the Second Number");
		b=sc.nextInt();
		c=a/b;
		System.out.println(a+"/"+b+"="+c);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		
		
	}

}
