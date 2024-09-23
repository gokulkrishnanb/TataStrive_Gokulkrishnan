package day15;

public class Demo {
	public static void main(String[] args) {
		Resource res = new Resource();
		Supplier supp = new Supplier(res);
		Consumer con = new Consumer(res);
		
		
	}
}
