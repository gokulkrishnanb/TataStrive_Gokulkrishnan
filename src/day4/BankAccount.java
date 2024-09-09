package day4;

public class BankAccount {

	private long accountNumber;
	private double balance;
	private double amount;
	
	
	public BankAccount() {
		super();
	}
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	public void deposit(double amount) 
	{
		balance=amount+balance;
		System.out.println("your balance :"+balance);
	
		
	}
	public void withdraw(double amount)
    {
		if(balance>=amount) {
	    balance=balance-amount;
	    System.out.println("your balance :"+balance);
		}
		else {
			System.out.println("invalid balance your balance is less :"+balance);
		}
		
    }
	
	public double Balance() {
		return balance;
		}
	public void show() {
		System.out.println("your account number :"+accountNumber+"\nyour balance :"+balance);
	}
	
}