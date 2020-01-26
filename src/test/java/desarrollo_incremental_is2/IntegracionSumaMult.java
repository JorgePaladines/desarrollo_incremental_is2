package desarrollo_incremental_is2;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class IntegracionSumaMult {

	@Mock
	Suma suma = new Suma();
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 
	
	Multiplicacion mult = new Multiplicacion(suma);

	@Test
	public void testIntegracion1() {
		assertEquals(6.0,mult.multiplicar(2, 3), 0);
		assertEquals(12.0,mult.multiplicar(4, 3), 0);
		assertEquals(-10.0,mult.multiplicar(5, -2), 0);
		assertEquals(16.0,mult.multiplicar(-4, -4), 0);
		//verify(suma).sumar(Math.abs(2), Math.abs(2));
	}
	
	@Test
	public void testIntegracionExcep() {
		String x = "a";
		double x_num = Double.parseDouble(x);
		assertEquals(6.0,mult.multiplicar(x_num, 3), 0);
	}

}
