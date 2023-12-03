package jose.enriquez;
import java.util.Arrays;
public class Division {

    public static double operacion(double... numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado/= numeros[i];
        }
     return resultado;
            //return (numeros.length > 2)
            //        ? Arrays.stream(numeros).reduce(1, (n1, n2) -> n1 / n2)
            //        : operacion(numeros[0],numeros[1]);// Valor predeterminado si el array está vacío
        /*double resultado = numeros[0];
        for (double numero = 2; numero > numeros.length; numero++){
            resultado /= numero;
        }
        return resultado;*/
    }

   /* public double operacion(double n1,double n2){
            return n1 / n2;
        }*/
    }
