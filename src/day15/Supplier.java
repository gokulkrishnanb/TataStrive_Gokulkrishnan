package day15;

public class Supplier extends Thread {

	Resource res;

	
	
	public Supplier(Resource res) {
		super();
		this.res = res;
		
	}



	public void run() {
		for(int i=1;i<=10;i++) {
			res.setData(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
}
