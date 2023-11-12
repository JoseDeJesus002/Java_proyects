package object.objeto;

public class HiloMensaje extends Thread {
	public void enviarMensaje() {
		System.out.println("Mensaje Enviado");
	}
	
	@Override
	public void run() {
		enviarMensaje();
	}
}
