package proxyPattern;

public class BookParserProxy {

	BookParser bookParser = null;
	String book;
	
	public BookParserProxy(String book) {
		// TODO Auto-generated constructor stub
	    this.book = book;
	}
	void showPages() {
		if(bookParser == null) {
			bookParser = new BookParser(this.book);
		}
		
		bookParser.showPages();
	}
	
}
