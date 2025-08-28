import java.util.Scanner;

public class p022_VerificaSuma {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("VERIFICAR SI LA SUMA DE DOS NÚMEROS ES IGUAL A UN TERCERO.\n");
		
		System.out.print("\nDa el número 1 : ");n1 = obj.nextInt();
		System.out.print("\nDa el número 2 : ");n2 = obj.nextInt();
		System.out.print("\nDa el número 3 : ");n3 = obj.nextInt();
		
		if (n1 + n2 == n3) { // las operaciones aritméticas tienen prioridad
			System.out.println("\n\nPositivo.");
			System.out.printf("\n  %d   +  %d   =  %d\n",n1,n2,n3);
		}
		else {
			System.out.println("\n\nNegativo.");
			System.out.printf("\n  %d   +  %d   ≠  %d\n",n1,n2,n3);
		} 
		obj.close();
	}
}