package Ordenación;

import org.junit.Test;

public class Ordenar3{

	@Test
	public void testOrdenacion() {
		int expectativa = 9;
		int num1 = 6;
		int num2 = 8;
		int num3 = 9;
		String ordenacion = Ordenacion.ordenacion(num1, num2, num3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion1() {
		int expectativa = 4;
		int num1 = 3;
		int num2 = 7;
		int num3 = 4;
		String ordenacion = Ordenacion.ordenacion(num1, num2, num3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion2() {
		int expectativa = 7;
		int num1 = 5;
		int num2 = 2;
		int num3 = 7;
		String ordenacion = Ordenacion.ordenacion(num1, num2, num3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion3() {
		int expectativa = 3;
		int num1 = 7;
		int num2 = 1;
		int num3 = 3;
		String ordenacion = Ordenacion.ordenacion(num1, num2, num3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion4() {
		int expectativa = 2;
		int num1 = 4;
		int num2 = 8;
		int num3 = 2;
		String ordenacion = Ordenacion.ordenacion(num1, num2, num3);
		
		equals(ordenacion);

	}
	
	@Test
	public void testOrdenacion5() {
		int expectativa = 6;
		int num1 = 9;
		int num2 = 8;
		int num3 = 6;
		String ordenacion = Ordenacion.ordenacion(num1, num2, num3);
		
		equals(ordenacion);

	}
	
}
