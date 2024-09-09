package day10;
import java.util.Comparator;

public class sortById implements Comparator<Product>{
	
	public int compare(Product o1,Product o2) {
		return o1.productId-o2.productId;
	}
	

}
