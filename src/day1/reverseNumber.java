package day1;
import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the 4 digit number");
		int getno = SC.nextInt();
		 if(getno<1000 || getno>10000) {
			 System.out.println(getno+" is an invalid Number");
			 return;
		 }
		 int result = 0;
		 String plus = "";
		 int count = 4;
		 while(getno!=0) {
			int rem = getno%10;
			plus+=rem;
			for(int i=1;i<count;i++) {
				plus+="0";
			}
			if(count!=0) {
				plus+="+";
				count--;
			}
			
			 result=result*10+rem;
			 getno=getno/10;
			 
		 }
		 System.out.println("Reverse number is "+result);
		 
		
		
	}
}
