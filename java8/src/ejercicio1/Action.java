package ejercicio1;

@FunctionalInterface
public interface Action extends Runnable {
	void execute();

	@Override
	default void run() {
		this.execute();
	}
}
