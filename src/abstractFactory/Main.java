package abstractFactory;

public class Main {

	public static void main(String args[]) {
		
		IAbstractFactory factory = FactoryProducer.getFactory(true);
		factory.getProduct(false);
		
		FactoryProducer factoryProducer = new FactoryProducer();
		IAbstractFactory factory2 = factoryProducer.getFactory2(false);
		factory2.getProduct(true);
	}
}
