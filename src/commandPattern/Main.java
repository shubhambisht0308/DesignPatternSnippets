package commandPattern;

public class Main {

	public static void main(String args[]) {
		
		RemoteTheInvoker invoker = new RemoteTheInvoker(new CommandTurnOn(new LightBulb()), new CommandTurnOff(new LightBulb()), 
				new CommandBrightUp(new LightBulb()), new CommandDimDown(new LightBulb()));
		
		
		
		 invoker.clickBrightUp(); invoker.clickOn(); invoker.clickOff();
		 invoker.clickDimDown();
		 
		invoker.setCommand(new CommandDimDown(new LightBulb()));
		invoker.execute();
	}

}
