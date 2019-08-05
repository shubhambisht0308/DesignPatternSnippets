package strategyPattern;

interface Operation {
	void doOperation(int a, int b);
}

class Add implements Operation {
	
	@Override
	public void doOperation(int a, int b) {
		// TODO Auto-generated method stub
	    System.out.println(a+b);	
	}
}

class Subtract implements Operation {
	
	@Override
	public void doOperation(int a, int b) {
		// TODO Auto-generated method stub
	    System.out.println(a-b);	
	}
}

class Strategy {
  Operation operation;
  
  public Strategy(Operation operation) {
	// TODO Auto-generated constructor stub
	  this.operation = operation;
  }
  
  void doOperation(int a, int b) {
	  operation.doOperation(a, b);
  }
}

public class StrategyPattern {
    public static void main(String args[]) {
    
    	new Strategy(new Add()).doOperation(5, 3);
    	new Strategy(new Subtract()).doOperation(5, 3);
    }
}
