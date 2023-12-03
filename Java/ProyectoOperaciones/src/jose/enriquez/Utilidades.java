package jose.enriquez;


import java.util.Random;

public class Utilidades {
    private static final Random random = new Random();
    private static final Random rando = new Random();
    public static int generarNumeroAleatorio(){
        return random.nextInt(4);
    }
    public static int generarNumeroAleatorios(){
        return rando.nextInt(4);
    }
}
