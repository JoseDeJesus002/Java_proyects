package time.timer;
import java.io.IOException;
public class Cronometro {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Segundos segundos = new Segundos();
        Minutos minutos = new Minutos();
        Horas horas = new Horas();
        
        segundos.start();
        minutos.start();
        horas.start();
        
        try {
            while (true) {
                Thread.sleep(1000); // Espera un segundo
                System.out.println(horas.getHoras() + ":" + minutos.getMinutos() + ":" + segundos.getSegundos());
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
