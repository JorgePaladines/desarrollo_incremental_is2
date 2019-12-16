package desarrollo_incremental_is2;

class Main {
	public static void main(String[] args) {
		Suma suma = new Suma();
		Multiplicacion multiplicacion = new Multiplicacion(suma);
		System.out.println(multiplicacion.multiplicar(5, -1));
		Resta resta = new Resta();
	}
}
