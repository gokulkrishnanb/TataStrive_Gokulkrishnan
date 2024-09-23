package day3;

public class student {

	private String name;
	private int grade;
	
	
	public student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	


	public student() {
		super();
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "student name :"+name+"\nstudent grade :"+grade;
	}
	
	
	
}
