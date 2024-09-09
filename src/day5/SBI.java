package day5;

public class SBI extends Gpay {
	private double balance=10000;
	

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		if(amount<balance) {
			balance-=amount;
			String transDetails = "Payment of rs."+amount+"made using SBI";
			recordTransaction(transDetails);
		}
		
	}
	@Override
	public void checkBalance(int pin) {
		if(this.pin==pin) {
			System.out.println("your sbi balance is "+balance);
		}
		else {
			System.out.println("invalid pin");
		}
		// TODO Auto-generated method stub
		

}
}
