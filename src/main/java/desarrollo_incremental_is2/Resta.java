package desarrollo_incremental_is2;

/*
@author Miguel Murillo
*/

public class Resta {
	
	public Suma suma;
	public Multiplicacion multiplicacion;
	
	public Resta(Suma suma, Multiplicacion multiplicacion) {
		this.suma = suma;
		this.multiplicacion = multiplicacion;
	}
	
	public double restar( double minuendo, double sustraendo ) {
		double sustraendo_neg = multiplicacion.multiplicar(-1,sustraendo);
		return  suma.sumar(minuendo, sustraendo_neg);
	}
}