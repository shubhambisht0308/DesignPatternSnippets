package adapterPattern;

public class Adapter implements IAdapter {
	
	Adaptee adaptee;
	
	Adapter(Adaptee a) {
		this.adaptee = a;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("Generic request!");
		this.adaptee.specificRequest();
	}

}
