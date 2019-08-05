package proxyPattern;

public class BookParser implements IBookParser {

	int bookPage = 10;
	String book = null;
	BookParser(String book) {
		System.out.println("Expensive object creation");
		this.book = book;
	}
	
	public void showPages() {
		System.out.println(bookPage);
	}
	
}
