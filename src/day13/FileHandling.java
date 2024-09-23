package day13;

import java.io.*;
import java.util.Scanner;



public class FileHandling {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		try {
//			FileWriter fw = new FileWriter("C:\\Users\\GOKUL\\OneDrive\\Desktop\\eclipse\\filehandling\\sample.txt",
//					true);
//			BufferedWriter bw = new BufferedWriter(fw);
//			System.out.println("Enter the size of the line");
//			int size = sc.nextInt();
//			
//			for(int i = 0;i<=size;i++) {
//				String text = sc.nextLine();
//				bw.append(text);
//				bw.newLine();
//				
//			}
//			bw.close();
//			System.out.println("success");
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("something happen");
//		}
		try {
			FileReader fr = new FileReader("C:\\Users\\GOKUL\\OneDrive\\Desktop\\eclipse\\filehandling\\sample.txt");
			int c = fr.read();

			while (c != -1) {
				System.out.print((char) c);
				c = fr.read();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
