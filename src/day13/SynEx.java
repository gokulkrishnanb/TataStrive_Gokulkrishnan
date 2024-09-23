package day13;

public class SynEx {

	public static void main(String[] args) throws InterruptedException {
		
		Data obj  = new Data();
		MyThread t1 = new MyThread(obj);
		MyThread t2 = new MyThread(obj);
		
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		
		System.out.println("Count value is: "+obj.count);
	}
}
		