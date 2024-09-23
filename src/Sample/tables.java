package Sample;

import java.util.Scanner;

public class tables {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you table");
		int n=sc.nextInt();
		for(int i=1;i<=20;i++) {
			
			System.out.println(n+"x"+i+"="+n*i);
			Thread.sleep(500);
		}
	}

}
