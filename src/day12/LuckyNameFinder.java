package day12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LuckyNameFinder {

	public int getSum(String name) {
		int num = 0;

		char[] name1 = name.toUpperCase().toCharArray();

		for (char c : name1) {
			num += c - 'A' + 1;
		}

		return num;
	}
	
	public String getLuckyName(String path,int luck) {
	String result = "";
	String line = "";
		
		
		
		try(FileReader fr=new FileReader(path); BufferedReader br =new BufferedReader(fr)){
			 
			 
			while((line= br.readLine())!=null) {
				//System.out.println(getSum(line));
				int equals1 = getSum(line);
				if(luck==equals1) {
					result += line+"\n";
				}
			}
					if(result=="") {
						System.out.println("better luck next time");
					
				}else {
					System.out.print(result);
				}
				return "";
				
			}
		
		catch(FileNotFoundException e1) {
			System.out.println("file is not found ");
		}
		catch(IOException e) {
			System.out.println("file not acess");
		}
		
		return line;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luckyNumber = sc.nextInt();
		LuckyNameFinder lnf = new LuckyNameFinder();
		System.out.println(lnf.getLuckyName("C:\\D\\names.text",luckyNumber));
	}
}
