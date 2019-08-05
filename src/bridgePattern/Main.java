package bridgePattern;

public class Main {

	public static void main(String args[]) {
		LongFormView longFormView = new LongFormView(new ConcreteAuthorResource(new Author()));
		longFormView.show();
		
		ShortFormView shortFormView = new ShortFormView(new ConcreteBookResource(new Book()));
		shortFormView.show();
	}
}
