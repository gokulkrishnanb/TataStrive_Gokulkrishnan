package day4;

public class mainbank {
	public static void main(String[] args) {
	BankAccount s = new savingsAccount(229999449,3476,5);
		s.show();
		s.withdraw(1000);
		s.deposit(2000);
		
	}

}
