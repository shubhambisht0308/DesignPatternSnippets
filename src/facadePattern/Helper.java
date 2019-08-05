package facadePattern;

public class Helper {

	VegRestaurant vg;
	NonVegRestaurant nvg;
	
	Helper() {
		vg = new VegRestaurant();
		nvg = new NonVegRestaurant();
	}
	
	void getVegMenu() {
		vg.showMenu();
	}
	
	void getNonVegMenu() {
		nvg.showMenu();
	}
}
