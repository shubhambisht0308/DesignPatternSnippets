package commandPattern;

public class RemoteTheInvoker {

	ICommand commandTurnOn;
	ICommand commandTurnOff;
	ICommand commandBrightUp;
	ICommand commandDimDown;
	
	ICommand genericCommand;
	
	public RemoteTheInvoker(	ICommand commandTurnOn,
	ICommand commandTurnOff,
	ICommand commandBrightUp,
	ICommand commandDimDown) {
		// TODO Auto-generated constructor stub
		
		this.commandTurnOn = commandTurnOn;
		this.commandTurnOff = commandTurnOff;
		this.commandBrightUp = commandBrightUp;
		this.commandDimDown = commandDimDown;
	}
	
	public void clickOn() {
		this.commandTurnOn.execute();
	}
	public void clickOff() {
		this.commandTurnOff.execute();
	}
	public void clickBrightUp() {
		this.commandBrightUp.execute();
	}
	public void clickDimDown() {
		this.commandDimDown.execute();
	}
	
	public void setCommand(ICommand c) {
		this.genericCommand = c;
	}
	
	public void execute() {
		this.genericCommand.execute();
	}
}
