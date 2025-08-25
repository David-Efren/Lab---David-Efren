import java.util.Scanner;

public class p013_VolumenCilindro {
	public static void main(String[] args) {
	    // Declarar
    	Scanner obj = new Scanner(System.in);
		double R,x,y;// math.sqrt acepta doubles y saca doubles, de otra forma hay perdidas de calidad oor la conversion
		
		System.out.println("Calcular volumen de cilindro.");
		// Leer
		System.out.print("\n\nIntroduce radio         	:"); x = obj.nextDouble();
		System.out.print("\nIntroduce altura           :"); y = obj.nextDouble();
	    // Calcular
	    R = Math.PI*(x*x)*y;
	    // Mostrar
	    System.out.printf("\n\nEl volumen de tu cilindro es	: %.2f",R);
	}
}