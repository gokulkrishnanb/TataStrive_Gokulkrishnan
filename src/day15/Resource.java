package day15;

public class Resource {

	int value;
	boolean flag;

	synchronized void setValue(int value)   {
		this.value = value;
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag = true;
		notifyAll();
		System.out.println("value is seted :"+value);
	}

	synchronized int getValue()  {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("value is : "+value);
		flag = false;
		notifyAll();
		return value;
		
	}

}
