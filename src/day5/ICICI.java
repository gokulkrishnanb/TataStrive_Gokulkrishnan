package day5;

public class ICICI extends Gpay {
	private double balance=5000;
	

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		if(amount<balance) {
			balance-=amount;
			String transDetails = "Payment of rs."+amount+"made using ICICI";
			recordTransaction(transDetails);
		}
		
	}
	@Override
	public void checkBalance(int pin) {
		if(this.pin==pin) {
			System.out.println("you balance is "+balance);
		}
		else {
			System.out.println("invalid pin");
		}
		// TODO Auto-generated method stub
		
	}

}
