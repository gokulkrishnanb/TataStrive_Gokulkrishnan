package day13;

public class MyThread extends Thread {

	Data obj;
	
	MyThread(Data obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			obj.increment();
		}
	}
	
}
