package day7;

public class convertion {
	 protected int get ;
	 public String convert() {
		 for(int i=0;i<2;i++) {
			
			switch (get) {

			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			case 0:
				return "zero";

			}

			return "Zero";
		
		}
		 return null;
	 }
	public convertion(int get) {
		super();
		this.get = get;
	}
	 

}
