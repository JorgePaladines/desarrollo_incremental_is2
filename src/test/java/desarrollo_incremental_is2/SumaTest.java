package desarrollo_incremental_is2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/*
@author Miguel Murillo
*/

public class SumaTest {

	Suma test;
	
	@Test
	public void testSumar1() {
		test = mock(Suma.class);
		when(test.sumar(2, 3)).thenReturn(5.0);
		assertEquals(5.0,test.sumar(2, 3),0);
	}
	
	@Test
	public void testSumar2() {
		test = mock(Suma.class);
		String x = "a"; 
		double x_num = Double.parseDouble(x);
		//Se pone que devuelva -1.0 porque nunca devolvera un resultado valido
		when(test.sumar(x_num, 3)).thenReturn(-1.0); 
		assertEquals(-1.0,test.sumar(x_num, 3),0);
	}
	
	@Test
	public void testSumar3() {
		test = mock(Suma.class);
		String y = "a"; 
		double y_num = Double.parseDouble(y);
		//Se pone que devuelva -1.0 porque nunca devolvera un resultado valido
		when(test.sumar(2, y_num)).thenReturn(-1.0); 
		assertEquals(-1.0,test.sumar(2, y_num),0);
	}
	
	@Test
	public void testSumar4() {
		test = mock(Suma.class);
		String x = "a";
		String y = "b";
		double x_num = Double.parseDouble(x);
		double y_num = Double.parseDouble(y);
		//Se pone que devuelva -1.0 porque nunca devolvera un resultado valido
		when(test.sumar(x_num, y_num)).thenReturn(-1.0); 
		assertEquals(-1.0,test.sumar(x_num, y_num),0);
	}
	
	@Test
	public void testSumar5() {
		test = mock(Suma.class);
		when(test.sumar(-Double.MAX_VALUE, 1)).thenReturn(-Double.MAX_VALUE+1);
		assertEquals(-Double.MAX_VALUE+1,test.sumar(-Double.MAX_VALUE, 1),0);
	}
	
	@Test
	public void testSumar6() {
		test = mock(Suma.class);
		when(test.sumar(1,-Double.MAX_VALUE)).thenReturn(1-Double.MAX_VALUE);
		assertEquals(1-Double.MAX_VALUE,test.sumar(1,-Double.MAX_VALUE),0);
	}
	
	@Test
	public void testSumar7() {
		test = mock(Suma.class);
		when(test.sumar(Double.MAX_VALUE,1)).thenReturn(Double.MAX_VALUE+1); 
		//El assert fallara ya que el valor devuelto se sale del rango del tipo Double
		assertTrue(test.sumar(Double.MAX_VALUE,1) > Double.MAX_VALUE);
	}
	
	@Test
	public void testSumar8() {
		test = mock(Suma.class);
		when(test.sumar(1,Double.MAX_VALUE)).thenReturn(1+Double.MAX_VALUE); 
		//El assert fallara ya que el valor devuelto se sale del rango del tipo Double
		assertTrue(test.sumar(1,Double.MAX_VALUE) > Double.MAX_VALUE);
	}

}
