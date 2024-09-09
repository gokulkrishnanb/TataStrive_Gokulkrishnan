package day10;

import java.util.Arrays;
import java.util.Comparator;

public class happyMart {
	public static void main(String[] args) {
		Product[] products = { new Product(2002, "Meyboard", 400), new Product(2003, "Mouse", 500),
				new Product(2004, "Pendrive", 1000), new Product(2010, "CD", 50), new Product(2013, "Charger", 1400),
				new Product(2030, "RAM", 4000),

		};

		Arrays.sort(products, new sortById());
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}

		System.out.println("-----------------------------");
		Arrays.sort(products, new sortByPrice());
		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println("-----------------------------");
		Arrays.sort(products, new sortByName());
		for (Product p : products) {
			System.out.println(p);
		}

	}

}
