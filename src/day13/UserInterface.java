package day13;

import java.io.*;
import java.util.*;

import Sample.Product;

public class UserInterface {
	static Product p;
	static Scanner sc = new Scanner(System.in);

	public static Product addProduct() {
		System.out.println("Enter the product ID");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the product Name");
		String name = sc.nextLine();

		System.out.println("Enter the product price");
		double price = sc.nextDouble();
		return new Product(id, name, price);

	}

	public static void main(String[] args) {
		int select = 0;
		ArrayList<Product> list1 = new ArrayList<Product>();
		try(FileInputStream fin = new FileInputStream("C:\\D\\productlist.txt");ObjectInputStream oin = new ObjectInputStream(fin);){
			list1 = (ArrayList<Product>) oin.readObject();
			}catch(Exception e) {
			e.printStackTrace();
		}
		do {
			System.out.println("1)Add Product");
			System.out.println("2)Show product");
			System.out.println("3)Save");
			System.out.println("4)Exit");

			System.out.println("Enter the choice");
			select = sc.nextInt();

			switch (select) {
			case 1:
				list1.add(addProduct());
				break;
			case 2:

				for(Product pr : list1) {
		        	System.out.println(pr);
		        }
				break;

			case 3:

				try (FileOutputStream fout = new FileOutputStream("c:\\D\\productlist.txt",true);
						ObjectOutputStream out = new ObjectOutputStream(fout)) {
					out.writeObject(list1);

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}

		} while (select != 4);

	}

}
