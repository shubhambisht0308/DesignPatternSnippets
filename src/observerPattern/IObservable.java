package observerPattern;

public interface IObservable {

	void add(IObserver observer);
	void delete(IObserver observer);
	void execute();
}
