package ejercicio2;

public class HelloWorld {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Hello there!!"));
		thread.start();
	}
	
}
