import java.util.Scanner;

public class p009_DividirEnCifras {
	public static void main(String[] args) {
		System.out.println("\033[H\033[2J"); // Limpiar terminal??????
		// Recibir, acortado
		System.out.print("Da un número entero:   ");
		int num = new Scanner(System.in).nextInt();
		// Proceso
		int cent = num / 100;
		int dec = (num - cent*100) / 10;
		int uni = num - (cent *100 + dec*10);
		
		// Salida
		System.out.printf("\n\nNúmero     : %d",num);
		System.out.printf("\nCentenas   : %d",cent);
		System.out.printf("\nDecenas    : %d",dec);
		System.out.printf("\nUnidades   : %d",uni);
		
	}
}