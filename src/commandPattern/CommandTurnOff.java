package commandPattern;

public class CommandTurnOff implements ICommand {
	LightBulb lightBulb;
	
	//Dependency Injection in the constructor here
	CommandTurnOff(LightBulb lb)  {
		this.lightBulb = lb;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.lightBulb.turnOff();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		this.lightBulb.turnOn();
	}
}
