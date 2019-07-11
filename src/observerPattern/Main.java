package observerPattern;

public class Main {

	public static void main(String args[]) {
		ObservableWeatherStation ows = new ObservableWeatherStation();
		FirstObserver fb = new FirstObserver();
		SecondObserver sb = new SecondObserver();
		
		ows.add(fb);
		ows.add(sb);
		
		ows.execute();
		
		ows.delete(sb);
		ows.execute();
	}
}
