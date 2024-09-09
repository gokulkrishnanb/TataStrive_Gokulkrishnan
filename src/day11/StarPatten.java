package day11;

public class StarPatten {

	public static void main(String[] args) {
		int num = 20;
		// TODO Auto-generated method stub
		for(int j=1;j<=num;j++) {
			
		for (int i = 1; i <=num; i++) {
			if(j==1||i==1||j==num||i==num) {

			System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
		}
		


	}

}
