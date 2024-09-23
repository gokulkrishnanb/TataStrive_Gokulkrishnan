package day15part2;

public class Resource {
        boolean isDriverAvailable;
        String Dname;
        String Pname;
        
       synchronized void assignDriver(String Dname) {
    	   while(isDriverAvailable) {
    		   try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
    	   isDriverAvailable = true;
        	this.Dname= Dname;
        	notifyAll();
        	System.out.println("Driver :"+Dname+"is available");
        }
       synchronized void assignPassenger(String Pname) {
    	   while(!isDriverAvailable) {
    		   try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
    	   isDriverAvailable = false;
        	this.Pname= Pname;
        	notifyAll();
        	System.out.println("driver :"+Dname+"is assign to the passenger :"+Pname);
        }
        
}
