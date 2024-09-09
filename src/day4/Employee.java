package day4;

public class Employee {
	 String name;
	 int id;
	 double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("name :"+name+"\nid"+id+"\nsalary"+salary);
	}
	

}
