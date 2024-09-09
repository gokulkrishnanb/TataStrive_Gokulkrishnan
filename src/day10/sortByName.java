package day10;

import java.util.Comparator;

public class sortByName implements Comparator<Product>{
	
	public String compare(Product o1,Product o2) {
		return o1.productName.compareTo(o2.productName);
	}
}
