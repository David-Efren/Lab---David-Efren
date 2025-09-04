import java.util.Scanner;

public class p033_NumerosConsecutivos {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n1,n2,n3;
		
		// Entrada 
		System.out.println("VERIFICAR CONSECUTIVO\n");
		System.out.print("\n  Ingresa el primer número  "); n1 = obj.nextInt();     
		System.out.print("\n  Ingresa el segundo número  "); n2 = obj.nextInt();   
		System.out.print("\n  Ingresa el tercer número  "); n3 = obj.nextInt();   
		
		// Proceso
		if ( n2 == n1 + 1 ) {
			System.out.println("\n\nEl número uno es menor al dos.");
			if ( n3 == n2 + 1 ) {
				System.out.println("\nEl número tres es mayor al número uno.");
				System.out.printf("\n\nSON CONSECUTIVOS\n  %d  ->  %d  ->  %d",n1,n2,n3);
			} else System.out.println("\n\nNO SON CONSECUTIVOS");
		}
		else System.out.println("\n\nNO SON CONSECUTIVOS");
	}
}