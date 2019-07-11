package observerPattern;

public class SecondObserver implements IObserver {
	
	public SecondObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int val) {
		// TODO Auto-generated method stub
		System.out.println("SecondObserver called");
	}

}