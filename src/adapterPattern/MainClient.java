package adapterPattern;

public class MainClient {

	public static void main(String args[]) {
		
		Adapter adapter = new Adapter(new Adaptee());
		adapter.request();
	}
}
