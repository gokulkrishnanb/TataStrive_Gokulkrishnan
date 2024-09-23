package day15;

public class Supplier extends Thread {
	Resource res;

	public Supplier(Resource res) {
		super();
		this.res = res;
		start();
	}
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			res.setValue(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
