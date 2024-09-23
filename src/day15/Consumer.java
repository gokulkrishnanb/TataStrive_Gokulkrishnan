package day15;

public class Consumer extends Thread{

	Resource res;


	public Consumer(Resource res) {
		super();
		this.res = res;
		
	}


	public void run() {
		for (int i = 1; i <= 10; i++) {
			res.getData();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
