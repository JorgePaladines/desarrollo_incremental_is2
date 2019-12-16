package desarrollo_incremental_is2;

public class Multiplicacion {
	
	public Suma suma;
	
	public Multiplicacion(Suma suma) {
		this.suma=suma;
	}
	
	public double multiplicar(double multiplicando, double multiplicador) 
	{
		double ret = Math.abs(multiplicando);
		
		for (int i=1; i< Math.abs(multiplicador);i++) 
		{
			ret=suma.sumar(Math.abs(multiplicando),ret);
		}
		/*Positivas*/
		if(multiplicador>0) 
		{
			return ret;
		}
		/*Negativas*/
		else 
		{
			return -ret;
		}
			
	}
}
