package day15;

public class demo  {
	 
	
	public static void main(String[] args) {
		Resource res = new Resource();
		Consumer consumer = new Consumer(res);
		Supplier supplier = new Supplier(res);
		consumer.start();
		supplier.start();
		}

}
