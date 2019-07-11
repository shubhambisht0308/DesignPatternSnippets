package abstractFactory;

public class Factory2 extends AbstractFactory {

	public Factory2() {
		// TODO Auto-generated constructor stub
		System.out.println("Factory2");
	}
	
	@Override
	public IProduct getProduct(boolean type) {
		// TODO Auto-generated method stub
		if(type) {
			return new Product1();
		} else {
			return new Product2();
		}
	}
}
