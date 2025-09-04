import java.util.Scanner;

public class p028_LeyDeNewton {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float f,m,a;
		int op;
		
		System.out.println("Ley de Newton\n");
		System.out.println("  [1]  Fuerza  ( f = m / a )");
		System.out.println("\n  [2]  Fuerza  ( f = m / a )");
		System.out.println("\n  [3]  Fuerza  ( f = m / a )");
		System.out.println("\n  [4]  Fuerza  ( f = m / a )"); 
		op = obj.nextInt();
		if (op == 1) {
			System.out.println("\n\nFUERZA");
			System.out.print("\n  Ingresa la masa:  "); m = obj.nextFloat();
			System.out.print("\n  Ingresa la aceleración: "); a = obj.nextFloat();
			f = m * a;
			System.out.printf("\n Resultado:  %,.2f",f);
		} else if (op == 2) {
			System.out.println("\n\nMASA");
			System.out.print("\n  Ingresa la fuerza:  "); f = obj.nextFloat();
			System.out.print("\n  Ingresa la aceleración: "); a = obj.nextFloat();
			m = f / a;
			System.out.printf("\n Resultado:  %,.2f",m);
		} else if (op == 3) {
			System.out.println("\n\nACELERACION");
			System.out.print("\n  Ingresa la masa:  "); m = obj.nextFloat();
			System.out.print("\n  Ingresa la fuerza: "); f = obj.nextFloat();
			a = f / m;
			System.out.printf("\n Resultado:  %,.2f",f);
		} else if (op == 4) {
			System.out.println("\n\nbye");
		}
		System.out.println("\n\n PROGRAMA TERMINADO");
	}
}