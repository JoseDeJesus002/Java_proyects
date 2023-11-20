package jose.enriquez.Operaciones;

import java.util.Arrays;

public class Division {
    public double operacion(double... numeros) {

        return Arrays.stream(numeros)
                .reduce((n1, n2) -> n1 / n2)
                .orElse(1);  // Valor predeterminado si el array está vacío
    }
}
