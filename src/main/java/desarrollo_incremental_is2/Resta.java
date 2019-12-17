package desarrollo_incremental_is2;

public class Resta {
	
	public Suma suma;
	public Multiplicacion multiplicacion;
	
	public Resta(Suma suma, Multiplicacion multiplicacion) {
		this.suma = suma;
		this.multiplicacion = multiplicacion;
	}
	
	public double restar( double minuendo, double sustraendo ) {
		double minuendo_neg;
		double sustraendo_neg;
		double res;
		//Condicion
		//Dos negativos
		if(minuendo < 0 && sustraendo < 0) {
			minuendo_neg = multiplicacion.multiplicar(-1,minuendo);
			sustraendo_neg = multiplicacion.multiplicar(-1, sustraendo);
			res = suma.sumar(minuendo_neg, sustraendo_neg);
			return res;
		}
		//Minuendo negativo
		else {
			if(minuendo < 0) {
				minuendo_neg = multiplicacion.multiplicar(-1, minuendo);
				res = suma.sumar(minuendo_neg, sustraendo);
				return res;
			}
			//Sustraendo negativo
			else {
				if(sustraendo < 0) {
					sustraendo_neg = multiplicacion.multiplicar(-1,sustraendo);
					res = suma.sumar(minuendo, sustraendo_neg);
					return res;
				}
			}
		}
		//Ambos positivos
		res = suma.sumar(minuendo, sustraendo);
		return res;
	}
}
