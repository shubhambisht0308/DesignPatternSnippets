package commandPattern;

public class CommandDimDown implements ICommand {
	
	LightBulb lightBulb;
	
	//Dependency Injection in the constructor here
	CommandDimDown(LightBulb lb)  {
		this.lightBulb = lb;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.lightBulb.dimDown();
		}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		this.lightBulb.brightUp();
	}

}
