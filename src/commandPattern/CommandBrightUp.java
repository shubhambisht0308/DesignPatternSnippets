package commandPattern;

public class CommandBrightUp implements ICommand {

	LightBulb lightBulb;
	
	//Dependency Injection in the constructor here
	CommandBrightUp(LightBulb lb)  {
		this.lightBulb = lb;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.lightBulb.brightUp();
		}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		this.lightBulb.dimDown();
	}
}
