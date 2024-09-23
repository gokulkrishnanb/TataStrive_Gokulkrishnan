package day3;

public class car {

	private String make;
	private String model;
	private int year;
	
	
	public car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String methoddetails() {
		
		return "car details "+"\nmake"+make+"/nmodel"+model+"\nyear"+year;
	}

	@Override
	public String toString() {
		return "car details "+"\nmake : "+make+"\nmodel : "+model+"\nyear : "+year;
	}
	
	
	
}
