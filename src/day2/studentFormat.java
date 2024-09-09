package day2;

public class studentFormat {
	
	
	private  int id;
	private  static int nextid;
	private String name;
	private static String centre ;
	private static String country;
	
	 public studentFormat() {
	    	
	    }
	 
	 static {
		
		
		 centre = "Tata strive";
		 country = "india";
	 }
	 
	
	public studentFormat(String name) {
		id=++nextid;
		this.name = name;
		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCentre() {
		return centre;
	}

	public static String getState() {
		return country;
	}

	@Override
	public String toString() {
		return "ID :"+id+"\nNAME :"+name+"\ncentre :"+centre+"\ncountry :"+country+"\n...........";
	}
	
	
	
	
	
   
	
}
