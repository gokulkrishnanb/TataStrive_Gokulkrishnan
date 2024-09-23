package Sample;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Demo {
	static Scanner sc = new Scanner(System.in);

	public static Product addProduct() {
		System.out.println("Enter the product id:");
		int id = sc.nextInt();
		System.out.println("Enter the product name:");
		String name = sc.next();
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		return new Product(id, name, price);

	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Product product = null;
		ArrayList<Product> products  = new ArrayList<Product>();
		
		try (FileInputStream fin = new FileInputStream("C:\\D\\productlist.txt");
				ObjectInputStream in = new ObjectInputStream(fin)) {

			products = (ArrayList<Product>) in.readObject();
		}
		catch(EOFException e)
		{
			
		}
		catch(IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		int ch = 0;

		do {

			System.out.println("1.add product");
			System.out.println("2.view product");
			System.out.println("3.Save");
			System.out.println("4.exit");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				products.add(addProduct());
				
				break;
			case 2:
				
				for(Product p : products)
				{
					System.out.println(p);
				}
				
			case 3:
			
				try (FileOutputStream fout = new FileOutputStream("C:\\D\\productlist.txt");
						ObjectOutputStream out = new ObjectOutputStream(fout)) {

					out.writeObject(products);
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}

			break;
		}
			
			
		} while (ch != 4);

		}
	}