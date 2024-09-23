package day15;

public class Resource {

	int data;
	boolean type;

	

	synchronized void setData(int data) {

		while (type) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		type = true;
		notifyAll();
		System.out.println("data set :" + data);
	}
	synchronized int getData() {

		while (!type) {
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("data :" + data);
		type = false;
		notifyAll();
		return data;

	}

	

}
