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
		System.out.print("\n  Ingresa la quinta calificación:  ");c5 = obj.nextFloat();
		
		// proceso
		prom = (c1+c2+c3+c4+c5) / 5;
		
		System.out.printf("\n  Tu promedio es: %.2f",prom);

		if (prom > 0 && prom <= 6 ) {
			System.out.printf("\n  REPROBADO",prom);
		} else if (prom > 6 && prom <= 7) {
			System.out.printf("\n  Por poco",prom);
		} else if (prom > 7 && prom <= 8) {
			System.out.printf("\n  Mejorable",prom);
		} else if (prom > 8 && prom <= 9) {
			System.out.printf("\n  Excelente",prom);
		} else if (prom > 9 && prom <= 10) {
			System.out.printf("\n  Letsgoooooooooooooo",prom);
		} else {
			System.out.println("\n  ¿Qué?");
		}
	}
}