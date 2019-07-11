package observerPattern;

public class FirstObserver implements IObserver {
	

	public FirstObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int val) {
		// TODO Auto-generated method stub
		System.out.println("FirstObserver called " + val);
	}

}
