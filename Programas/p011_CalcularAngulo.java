import java.util.Scanner;

public class p011_CalcularAngulo {
	public static void main(String[] args) {
	    // Declarar
    	Scanner obj = new Scanner(System.in);
		float R,x,y;
		
		System.out.println("Calcular tercer angulo de un triangulo dado los primeros dos.");
		// Leer
		System.out.print("\n\nIntroduce el primer angulo         	: "); x = obj.nextFloat();
		System.out.print("\nIntroduce el segundo angulo           : "); y = obj.nextFloat();
	    // Calcular
	    R = 180-(x+y);
	    // Mostrar
	    System.out.printf("\n\nEl tercer angulon del triangulo es	: %.2f",R);
	}
}