package day4;

public class employeeDetails {
	public static void main(String[] args) {
		Employee e = new Developer("gokul",1001,34500,"java");
		e.displayDetails();
		e=new manager("krishnan", 2003, 376500, "CSE");
		e.displayDetails();
		
	}
	

}
