package ejercicio1;

public class HelloWorld {

	public static void main(String[] args) {
		
		Runnable run = () -> System.out.println("Hello there!!");
		Thread thread = new Thread(run);
		thread.start();
		
	}
	
}
