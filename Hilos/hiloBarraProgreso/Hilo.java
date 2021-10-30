package hiloBarraProgreso;

public class Hilo extends Thread 
{
	//Practica
	public static void main (String args[])
	{
		Hilo miHilo = new Hilo();
		Thread Hilo = new Thread(miHilo);
		miHilo.start();
		
		try {Thread.sleep(1000);}//1Segundo
		catch(InterruptedException ex) {ex.printStackTrace();}
		
		System.out.println("Hilo");
	}
}