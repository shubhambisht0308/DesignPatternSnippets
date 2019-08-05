package commandPattern;

// This is receiver for command
public class LightBulb {

	
	public void turnOn() {
		
		System.out.println("Bulb is on");
	}
	
	public void turnOff() {
		
		System.out.println("Bulb is off");
	}
	
	public void brightUp() {
		
		System.out.println("Bulb is Brighter");
	}
	
	
	public void dimDown() {
		
		System.out.println("Bulb is Dimmer");
	}
	
}
