package bridgePattern;

public class LongFormView extends AbstractorView {

	public LongFormView(IImplementorResource implementorResource) {
		super(implementorResource);
		// TODO Auto-generated constructor stub
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		implementorResource.showSnippet();
		implementorResource.showPicture();
	}

	
}
