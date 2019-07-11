package singleton;

public class Singleton {
	
	private static Singleton singletonObjectHolder;

	private Singleton() {
		System.out.println("Singleton object created");
	};
	
	public static Singleton getInstance() {
		if(singletonObjectHolder == null) {
			singletonObjectHolder = new Singleton();
		}
		return singletonObjectHolder;
	}
}
