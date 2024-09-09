package Sample;

public class Rectangle extends Shape {
	
	private double length;
	private double breath;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String color,double length, double breath) {
		super(color);
		this.length = length;
		this.breath = breath;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length*breath;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Area of Rectange :"+calculateArea());
	}
	
	
	
	
	
	
	

}
