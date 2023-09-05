package learn_Java;

public class Learn {

	public static void main(String[] args) {
		Proceso1 hilo1 = new Proceso1();
		//Se_utiliza_la_clase_thread_para_crear_el_objeto_y_como_parametro_se_pone_la_clase_hija
		Thread hilo2 = new Thread(new Proceso2());
		hilo1.start();
		hilo2.start();
	}

}
