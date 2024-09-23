package day12;

import java.util.Scanner;

public class UserInterface {

	public static String extractString(String sentence, int number1, int number2) {
		String indexwise = "";
		try {
			indexwise = sentence.substring(number1, number2);
			indexwise = "The output string is " + indexwise + ". ";
		} catch (StringIndexOutOfBoundsException e) {
			System.out.print("Invalid index position. ");
		} finally {
			return indexwise + "Thanks for using the application";
		}

	}

	public static void main(String[] args) {
		String sentence;
		int number1;
		int number2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		sentence = sc.nextLine();
		System.out.println("Enter First Index");
		number1 = sc.nextInt();
		System.out.println("Enter Second Index");
		number2 = sc.nextInt();

		System.out.println(extractString(sentence, number1, number2));
	}

	public char[] findPetName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
