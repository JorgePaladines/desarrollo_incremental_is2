package desarrollo_incremental_is2;

/*
 @author Daniela Montenegro, Miguel Murillo
*/

public class Multiplicacion {
	
	public Suma suma;
	
	public Multiplicacion(Suma suma) {
		this.suma=suma;
	}
	
	public double multiplicar(double multiplicando, double multiplicador) 
	{
		
		if(multiplicando == 0 || multiplicador == 0) {
			return 0;
		}
		else {
			double ret = Math.abs(multiplicando);
			
			for (int i=1; i< Math.abs(multiplicador);i++) 
			{
				ret=this.suma.sumar(Math.abs(multiplicando),ret);
			}
			/*Positivas*/
			if((multiplicador>0 && multiplicando>0) || (multiplicador<0 && multiplicando<0)) 
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
}
