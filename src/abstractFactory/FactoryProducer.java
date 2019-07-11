package abstractFactory;

public class FactoryProducer {

	public static IAbstractFactory getFactory(boolean val) {
		if(val) {
			return new Factory1();
		} else {
			return new Factory2();
		}
	}
	
	public IAbstractFactory getFactory2(boolean val) {
		if(val) {
			return new Factory1();
		} else {
			return new Factory2();
		}
	}
	
}
