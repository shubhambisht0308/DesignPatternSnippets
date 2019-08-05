package bridgePattern;

public abstract class AbstractorView {

	IImplementorResource implementorResource;
	
	public AbstractorView(IImplementorResource implementorResource) {
		// TODO Auto-generated constructor stub
	    this.implementorResource = implementorResource;
	}
	
	abstract void show();
}
