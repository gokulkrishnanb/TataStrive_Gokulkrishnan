package day4;

public class manager extends Employee {

	private String Department;

	public manager(String name,int id,double salary,String Department) {
		
		super(name,id,salary);
		this.Department=Department;
	}
	
public void displayDetails() {
	super.displayDetails();
		
		System.out.println("department :"+Department);
		
	}
	
		
		
	}

	
	
	
	

