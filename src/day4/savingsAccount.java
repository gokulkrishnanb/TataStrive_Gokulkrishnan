package day4;

public class savingsAccount extends BankAccount {
	
	private double interestRate;

	public savingsAccount() {
		super();
	}

	public savingsAccount(long accountNumber, double balance, double interestRate) {
		super( accountNumber,balance);
		this.interestRate = interestRate;
		super.Balance();
		
	}
	
	public void interestRate() {
		interestRate=Balance()*interestRate/100;
		
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("interest rate :"+interestRate);
	}
	
	
	

	
	
}
