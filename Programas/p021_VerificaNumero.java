// Verifica si el numero es pos, neg o cero
import java.util.Scanner;

public class p021_VerificaNumero {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("VERIFICAR NÚMERO\n");
		System.out.print("\nDa un número : ");int n = new Scanner(System.in).nextInt();
		
		// if super simple
		if (n<0) 
			System.out.println("\n\nTu numero es negativo.");
		// La sangría no es necesaria en java
		else if (n>0) System.out.println("\n\nTu número es positivo.");
		// Si hay más de una declaración, se debe usar corchetes {} 
		else {
			System.out.println("\n\nTu número es cero.");
			System.out.println("\nCero no es ni positivo ni negativo.");
		}
	}
}