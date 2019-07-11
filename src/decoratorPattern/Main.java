package decoratorPattern;

public class Main {

	public static void main(String args[]) {
		
		System.out.println("Cost : " + new ChocoDecorator(new Espresso()).getCost());
		System.out.println("Cost : " + new CreamDecorator(new Espresso()).getCost());
	}
}
