package desarrollo_incremental_is2;

import java.util.Scanner;

/*
@author Miguel Murillo, Jorge Paladines
*/

class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while(true) {
			System.out.println("Escriba la operacion a realizar por favor: ");
			String operacion = teclado.nextLine();
			System.out.println("Ingresa el primer numero por favor: ");
			String numero1 = teclado.nextLine();
			System.out.println("Ingresa el segundo numero por favor: ");
			String numero2= teclado.nextLine();
			try {
				if(operacion.equals("suma")) {
					Suma suma = new Suma();
					System.out.println(suma.sumar(Double.parseDouble(numero1), Double.parseDouble(numero2)));
				}
				if(operacion.equals("multiplicacion")) {
					Suma suma = new Suma();
					Multiplicacion multiplicacion = new Multiplicacion(suma);
					System.out.println(multiplicacion.multiplicar(Double.parseDouble(numero1), Double.parseDouble(numero2)));		
				}
				if(operacion.equals("resta")){
					Suma suma = new Suma();
					Multiplicacion multiplicacion = new Multiplicacion(suma);
					Resta resta = new Resta(suma, multiplicacion);
					System.out.println(resta.restar(Double.parseDouble(numero1), Double.parseDouble(numero2)));
				}
			}
			catch(NumberFormatException e){
				System.out.println("Error");
			}
		}
	}	
}
