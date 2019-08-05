package bridgePattern;

public class ConcreteBookResource implements IImplementorResource {

	Book book;
	
	public ConcreteBookResource(Book book) {
		// TODO Auto-generated constructor stub
		this.book = book;
	}
	
	@Override
	public void showSnippet() {
		// TODO Auto-generated method stub
		book.showBookDetails();
	}

	@Override
	public void showPicture() {
		// TODO Auto-generated method stub
		book.showImage();
	}

}
