package proxyPattern;

public class Client {

	public static void main(String args[]) {
		BookParserProxy bookParserProxy = new BookParserProxy("Cormen");
		bookParserProxy.showPages();
	}

}
