package bridgePattern;

public class ShortFormView extends AbstractorView {

	public ShortFormView(IImplementorResource implementorResource) {
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
