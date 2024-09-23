package day3;

public class person {
	private String name;
	private int age;

	public person() {

	}

	public person(String name, int age) {
		this.name = name;
		this.age = age;
		if (age < 0) {

			System.out.println("error input");
			age = 0;
		}
	}

	public boolean isAdult() {
		if (age >= 18) {

			return true;

		}
		return false;

	}

	public String toString() {
		return "Name :" + name + "\nage :" + age + (isAdult() ? "childhood" : "adult");

	}
}
