package kevin.hernandez.Operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    Division division =new Division();
@Test
    public  void testDividirDosNumeros(){

    assertEquals(1,division.operacion(2,2));
}
@Test
    public void testDividirTresNumeros(){
    assertEquals(0.16666666666666666,division.operacion(1,2,3));
}
}