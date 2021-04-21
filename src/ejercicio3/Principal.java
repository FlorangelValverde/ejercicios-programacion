package ejercicio3;

public class Principal {


	public static void main(String[] args) {
		Thread h1 = new Thread(new Hilo1(3));
		h1.start();
	}
}
