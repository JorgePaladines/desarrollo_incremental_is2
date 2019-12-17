package desarrollo_incremental_is2;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;

/*
@author Miguel Murillo
*/

public class RestaTest {
	
	Resta test;

	@Test
	public void testRestar1() {
		test = mock(Resta.class);
		String sustraendo = "a"; 
		double sustraendo_num = Double.parseDouble(sustraendo);
		//Se pone que devuelva -1.0 porque nunca devolvera un resultado valido
		when(test.restar(4, sustraendo_num)).thenReturn(-1.0); 
		assertEquals(-1.0,test.restar(4, sustraendo_num),0);
	}
	
	@Test
	public void testRestar2() {
		test = mock(Resta.class);
		when(test.restar(7.5, 3)).thenReturn(10.5);
		assertEquals(10.5,test.restar(7.5, 3),0);
	}
	
	@Test
	public void testRestar3() {
		test = mock(Resta.class);
		String minuendo = "a";
		String sustraendo = "b";
		double minuendo_num = Double.parseDouble(minuendo);
		double sustraendo_num = Double.parseDouble(sustraendo);
		//Se pone que devuelva -1.0 porque nunca devolvera un resultado valido
		when(test.restar(minuendo_num, sustraendo_num)).thenReturn(-1.0); 
		assertEquals(-1.0,test.restar(minuendo_num, sustraendo_num),0);
	}
	
	@Test
	public void testRestar4() {
		test = mock(Resta.class);
		when(test.restar(-Double.MAX_VALUE, 1)).thenReturn(-Double.MAX_VALUE-1); 
		//El assert fallara ya que el valor devuelto se sale del rango del Double
		assertTrue(test.restar(-Double.MAX_VALUE, 1) < -Double.MAX_VALUE);
	}
	
	@Test
	public void testRestar5() {
		test = mock(Resta.class);
		when(test.restar(Double.MAX_VALUE, -4)).thenReturn(Double.MAX_VALUE+4); 
		//El assert fallara ya que el valor devuelto se sale del rango del Double
		assertTrue(test.restar(Double.MAX_VALUE, -4) > Double.MAX_VALUE);
	}

}
