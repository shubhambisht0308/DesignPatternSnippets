package factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws IOException {
	
		AnimalFactory af = new AnimalFactory();
		af.getAnimal(1);
		af.getAnimal(2);
		af.getAnimal(15);
		af.getAnimal(20);
	}
}
