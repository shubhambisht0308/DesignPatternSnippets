package abstractFactory;

public class Factory1 extends AbstractFactory {

	public Factory1() {
		// TODO Auto-generated constructor stub
		System.out.println("Factory1");
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
