package day10;

import java.util.Comparator;

public class sortByPrice implements Comparator<Product>{
	
	public int compare(Product o1,Product o2) {
		return Double.compare(o2.price,o1.price);
	}
}
	