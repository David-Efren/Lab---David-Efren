import java.util.Scanner;

public class p012_ConvertirTemperatura {
	public static void main(String[] args) {
	    // Declarar
    	Scanner obj = new Scanner(System.in);
		double R,x;// float no funciona por alguna razón 
		
		System.out.println("Convertir Fahrenheit a Celcius.");
		// Leer
		System.out.print("\n\nIntroduce la temperatura         	: "); x = obj.nextDouble();
	    // Calcular
	    R = (x - 32) * (5.0 / 9.0); // Se necesitaron especificar las decimales por algun motivo????????
	    // Mostrar
	    System.out.printf("\n\n%.2f° Grados Fahrenheit son: %.2f° Grados Celsius.",x,R);
	    // Gracias Java.
	}
}