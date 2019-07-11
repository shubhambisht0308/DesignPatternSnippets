package observerPattern;

import java.util.ArrayList;

public class ObservableWeatherStation implements IObservable {
	
	ArrayList<IObserver> observerList = new ArrayList<IObserver>();
	int dummy = 10;

	@Override
	public void add(IObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
		
	}

	@Override
	public void delete(IObserver observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		for (IObserver iObserver : observerList) {
			iObserver.update(dummy);
		}
		
	}

}
