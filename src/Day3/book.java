package Day3;

public class book {

	private String title;
	private String author;
	
	
	
	public book(String title, String author) {
		
		this.title = title;
		this.author = author;
	}



	@Override
	public String toString() {
		return "title :"+title+"\nauthor :"+author;
	}
	
	
	
	
}
