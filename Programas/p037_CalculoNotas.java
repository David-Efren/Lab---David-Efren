import java.util.Scanner;


public class p037_CalculoNotas {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float c1,c2,c3,c4,c5,prom=0f;
		
		System.out.println("EVALUACIÓN DE CALIFICACIONES");
		System.out.print("\n  Ingresa la primera calificación:  ");c1 = obj.nextFloat();        
		System.out.print("\n  Ingresa la segunda calificación:  ");c2 = obj.nextFloat();
		System.out.print("\n  Ingresa la tercera calificación:  ");c3 = obj.nextFloat();
		System.out.print("\n  Ingresa la cuarta calificación:  ");c4 = obj.nextFloat();
		System.out.print("\n  Ingresa la quinta calificación:  ");c1 = obj.nextFloat();
		
		// proceso
		prom = (c1+c2+c3+c4+c5) / 5;
		
		if (prom )
	}
}