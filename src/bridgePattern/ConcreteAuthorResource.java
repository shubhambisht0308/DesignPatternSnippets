package bridgePattern;

public class ConcreteAuthorResource implements IImplementorResource{

	Author author;
	
	public ConcreteAuthorResource(Author author) {
		// TODO Auto-generated constructor stub
		this.author = author;
	}
	
	@Override
	public void showSnippet() {
		// TODO Auto-generated method stub
		author.showAuthorDetails();
	}

	@Override
	public void showPicture() {
		// TODO Auto-generated method stub
		author.showImage();
	}


}
