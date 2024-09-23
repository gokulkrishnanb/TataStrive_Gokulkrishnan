package day3;

public class rectangle {
	
	private double length;
	private double width;
	private double a;
	
	
	
	public rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		this.a=length*width;
	}



	public rectangle(double length) {
		
		this.length = length;
		this.width = 1.0;
		this.a=length*width;
	}
	
	



	@Override
	public String toString() {
		return "area of triangle :"+a;
	}
	
	
	
	
	
	

}
