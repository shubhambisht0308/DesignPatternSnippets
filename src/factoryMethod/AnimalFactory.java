package factoryMethod;

public class AnimalFactory implements IAnimalFactory {

	@Override
	public IAnimal getAnimal(int type) {
		// TODO Auto-generated method stub
		if(type%2 ==0)  
			return new Dog();
		else 
			return new Cat();
	}

}
