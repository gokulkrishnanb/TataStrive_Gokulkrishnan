package day8;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] question = { "1) 5+2=", "2) what is javac ?", "3) how many primitive datatypes in java ?",
				"4) choose which one is primitive", "5) find additional operator?",
				"6) JVM is not platform depentent" };
		String[][] option = { { "a)2", "b)6", "c)7", "d)8" },
				{ "a)compiler", "b)interpretor", "c)language", "d)Controller" }, { "a)6", "b)8", "c)12", "d)10" },
				{ "a)Object", "b)String", "c)Character", "d)int" }, { "a)++", "b)+=", "c)+", "d)*" },
				{ "a)true", "b)false" } };

		String[] anskey = { "c", "a", "b", "d", "c", "a" };
		double score = 0;

		for (int i = 0; i < question.length; i++) {
			System.out.println(question[i]);
			for (int j = 0; j < option[i].length; j++) {
				System.out.println(option[i][j]);

			}
			System.out.println("Enter your answer");
			String answer = sc.next();
			if (anskey[i].equals(answer)) {
				score++;
				System.out.println("correct answer!!!");
			} else {
				System.out.println("wrong answer");
			}
		}
		System.out.println("" + score + " out of " + anskey.length + " percentage"
				+ Math.round(score / anskey.length) * 100 + "%");

	}

}
