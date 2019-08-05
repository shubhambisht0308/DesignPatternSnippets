package commandPattern;

public class CommandTurnOn implements ICommand {

	LightBulb lightBulb;
	
	//Dependency Injection in the constructor here
	CommandTurnOn(LightBulb lb)  {
		this.lightBulb = lb;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.lightBulb.turnOn();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		this.lightBulb.turnOff();
	}
}
