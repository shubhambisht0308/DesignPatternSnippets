package strategyPattern;

public class StrategyPattern {

	public class Operation {
		
		public Strategy strategy;
		
		public Operation(Strategy strategy) {
			// TODO Auto-generated constructor stub
			this.strategy = strategy;
		}
		
		public void doOperation(int a, int b) {
			this.strategy.doOperation(a, b);
		}
	}
	
	public interface Strategy {
		void doOperation(int a, int b);
	}
	
	public class Add implements Strategy {
		
		@Override
		public void doOperation(int a, int b) {
			// TODO Auto-generated method stub
		    System.out.println(a+b);	
		}
	}
	
    public class Subtract implements Strategy {
		
		@Override
		public void doOperation(int a, int b) {
			// TODO Auto-generated method stub
		    System.out.println(a-b);	
		}
	}
    
    public class Dummy {
    	void doOperation(Strategy operation, int a, int b) {
    		operation.doOperation(a, b);
    	}
    }
    
    public static void main(String args[]) {
    	//Operation operation = new StrategyPattern().new Operation(new StrategyPattern().new Subtract());
    	//operation.doOperation(5, 3);
    	
    	Dummy operation = new StrategyPattern().new Dummy();
    	operation.doOperation(new StrategyPattern().new Subtract(), 5, 3);
    	
    }
}
