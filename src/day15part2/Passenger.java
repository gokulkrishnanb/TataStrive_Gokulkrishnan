package day15part2;

public class Passenger extends Thread {

	Resource res;
	String Pname;

	public Passenger(Resource res,String Pname) {
		this.res = res;
		this.Pname= Pname;
		start();
	}
	
	@Override
	public void run() {
		res.assignPassenger(Pname);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
