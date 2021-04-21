package ejercicio2;

public class Hilo1  extends Thread{
private int listas;
public Hilo1 (int listas) {
	this.listas=listas;
}
public void run() {
	System.out.println(this.listas + " al cubo " + Math.pow(this.listas, 3) );
}
}
