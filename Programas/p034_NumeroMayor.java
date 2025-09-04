import java.util.Scanner;

public class p034_NumeroMayor {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n1,n2,n3;
		
		// Entrada 
		System.out.println("VERIFICAR MAYOR\n");
		System.out.print("\n  Ingresa el primer número  "); n1 = obj.nextInt();     
		System.out.print("\n  Ingresa el segundo número  "); n2 = obj.nextInt();   
		System.out.print("\n  Ingresa el tercer número  "); n3 = obj.nextInt();   
		
		// Proceso
		if ( n1 > n2 && n1 > n3 ) {
			System.out.println("\n\nEl número uno es el MAYOR.");
		} else if ( n2 > n1 && n2 > n3 ) {
			System.out.println("\n\nEl número dos es el MAYOR.");
		} else if ( n3 > n2 && n3 > n1 ) {
			System.out.println("\n\nEl número dos es el MAYOR."); 
		} else System.out.println("\n\nSon iguales.");
	}
}