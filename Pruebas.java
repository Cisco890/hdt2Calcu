import org.junit.Test;
import static org.junit.Assert.*;

public class Pruebas {

    @Test
    public void testOperador() {
        String postfix = "62+3+"; // aca se está poniendo en práctica la suma
        double resultado = MenuCalc.operador(postfix);
        

        assertNotEquals("La suma no es la esperada, por lo que se comprueba que está haciendo bien la operación ya que el resultado es 11 y no 18",18.0, resultado);  
    }

    @Test
    public void testOperador2() {
        String postfix = "93-4-"; // aca se está poniendo en práctica la resta
        double resultado2 = MenuCalc.operador(postfix);
        assertEquals("La resta es la corecta",2.0,000,  resultado2);  
    }
    @Test
    public void testOperador3() {
        String postfix = "44*6*"; // aca se está poniendo en práctica la multiplicacion
        double resultado3 = MenuCalc.operador(postfix);
        assertEquals("La resta es la corecta",96.0,000,  resultado3);  
    }
    @Test
    public void testOperador4() {
        String postfix = "84/2/"; // aca se está poniendo en práctica la division
        double resultado4 = MenuCalc.operador(postfix);
        assertEquals("La resta es la corecta",1.0,000,  resultado4);  
    }
    @Test
    public void testOperador5() {
        String postfix = "45+6-4*2/"; // aca se está poniendo en práctica la division
        double resultado5 = MenuCalc.operador(postfix);
        assertEquals("La resta es la corecta",6.0,000,  resultado5);  
    }
    

}