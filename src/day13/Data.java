package day13;

public class Data {

	int count;
	
	synchronized void increment()
	{
		count++;
		
	}
	int getCount()
	{
		return count;
	}
}
