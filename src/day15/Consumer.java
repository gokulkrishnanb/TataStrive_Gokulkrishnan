package day15;

public class Consumer extends Thread {

	Resource res;

	public Consumer(Resource res) {
		
		this.res = res;
		start();
	}

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {
			res.getValue();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
