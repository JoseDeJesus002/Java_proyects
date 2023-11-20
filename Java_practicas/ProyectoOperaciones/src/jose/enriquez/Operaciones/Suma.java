package jose.enriquez.Operaciones;

import java.util.Arrays;

public class Suma {

    public double Operaciones(double... numeros) {
        double n = 0;
      //  for (int i = 0; i < numeros.length; i++){
        //    n+=numeros[i];
        //}

       // for(double numero :numeros){
         //   n+= numero;
        return Arrays.stream(numeros).sum();
    }

}
