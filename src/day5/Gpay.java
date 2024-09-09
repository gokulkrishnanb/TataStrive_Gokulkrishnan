package day5;

import java.util.ArrayList;

public abstract class Gpay {
	public int pin=1234;
	private static ArrayList <String> transaction = new ArrayList<String>();
	public abstract void makePayment(double amount);
	public abstract void checkBalance(int pin);
	public void commomFeature() {
		System.out.println("processing payment through Gpay platform");
	}
	public void recordTransaction(String transDetails) {
		transaction.add(transDetails);
	}
	public void showHistory() {
		transaction.forEach(s->System.out.println(s));
	}

}
