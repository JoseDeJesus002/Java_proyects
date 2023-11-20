package jose.enriquez.operaciones;

import jose.enriquez.Multiplicacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacionTest {

    @Test
    public void MultiplicarDosNumeros(){
        assertEquals(4,Multiplicacion.operacion(2,2));
    }
    @Test
    public void MultiplicarTresNumeros(){
        assertEquals(6,Multiplicacion.operacion(1,2,3));
    }

    @Test
    public void MultiplicarDiferentesNumeros(){
        assertEquals(6,Multiplicacion.operacion(-2,-1,3));
    }
}
