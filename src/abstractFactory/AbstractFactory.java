package abstractFactory;

abstract public class AbstractFactory implements IAbstractFactory{

	@Override
	abstract public IProduct getProduct(boolean type);

}
