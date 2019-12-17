package desarrollo_incremental_is2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/*
@author Miguel Murillo
*/

public class MultiplicacionTest {
	
	Multiplicacion test;

	@Test
	public void testMultiplicar1() {
		test = mock(Multiplicacion.class);
		when(test.multiplicar(4, 3)).thenReturn(12.0);
		assertEquals(12.0,test.multiplicar(4, 3),0);
	}
	
	@Test
	public void testMultiplicar2() {
		test = mock(Multiplicacion.class);
		when(test.multiplicar(5, -2)).thenReturn(-10.0);
		assertEquals(-10.0,test.multiplicar(5, -2),0);
	}
		
	@Test
	public void testMultiplicar3() {
		test = mock(Multiplicacion.class);
		when(test.multiplicar(-4, -4)).thenReturn(16.0);
		assertEquals(16.0,test.multiplicar(-4, -4),0);
	}
	
	@Test
	public void testMultiplicar4() {
		test = mock(Multiplicacion.class);
		String multiplicando = "a"; 
		double multiplicando_num = Double.parseDouble(multiplicando);
		//Se pone que devuelva -1.0 porque nunca devolvera un resultado valido
		when(test.multiplicar(multiplicando_num, 5)).thenReturn(-1.0); 
		assertEquals(-1.0,test.multiplicar(multiplicando_num, 5),0);
	}

}
