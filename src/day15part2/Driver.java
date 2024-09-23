package day15part2;

public class Driver extends Thread{
	Resource res;
	String Dname;

	public Driver(Resource res,String Dname) {
		this.res = res;
		this.Dname= Dname;
		start();
	}
	
	@Override
	public void run() {
		res.assignDriver(Dname);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
