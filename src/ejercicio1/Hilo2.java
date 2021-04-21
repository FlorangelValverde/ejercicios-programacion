package ejercicio1;

public class Hilo2 implements  Runnable{
	public void run() {
		for (int i = 10; i >=1; i--) {
			System.out.println(i);
		}
	}
}
