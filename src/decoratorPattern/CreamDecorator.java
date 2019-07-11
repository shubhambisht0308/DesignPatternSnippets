package decoratorPattern;

public class CreamDecorator implements BeverageDecorator {

	Beverage beverage;
	double creamCost = 5;
	public CreamDecorator(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost() +  creamCost;
	}
}
