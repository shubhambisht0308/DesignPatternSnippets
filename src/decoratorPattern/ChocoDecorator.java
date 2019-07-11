package decoratorPattern;

public class ChocoDecorator implements BeverageDecorator {

	Beverage beverage;
	double ChocoCost = 8;
	
	public ChocoDecorator(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost() +  ChocoCost;
	}
	
	

}
