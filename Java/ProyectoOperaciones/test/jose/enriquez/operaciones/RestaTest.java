package jose.enriquez.operaciones;

import jose.enriquez.Resta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaTest {
    @Test
    public void testRestarDosNumeros(){
        assertEquals(0,Resta.operacion(2,2));
    }

    @Test
    public void testRestarTresNumeros(){
        assertEquals(-4,Resta.operacion(1,2,3));
    }
    @Test
    public void testRestarDiferentesNumeros(){
        assertEquals(-4,Resta.operacion(-2,-1,1,2));
    }
}
