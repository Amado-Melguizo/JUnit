import static org.junit.Assert.*;

import org.junit.Test;

public class SubscripcionTest {
	@Test
	public void testprecioPorMes() {
		double esperado=1;
		Subscripcion s = new Subscripcion(200,2) ; 
		double resultado = s.precioPorMes();
		assertEquals(esperado = 100, resultado,0) ;
	}
	
	@Test
	public void testprecioPorMes2() {
		double esperado=67;
		Subscripcion s = new Subscripcion(200,3) ;
		double resultado= s.precioPorMes();
		assertEquals(esperado = 67.6666666666666667, resultado, 0) ;
		}
	}