package Sample;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Area of Circle :"+calculateArea());
	}
	

}
