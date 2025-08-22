import java.util.Scanner;

public class p007_OperadoresAsignacion {
	public static void main(String[] args) {
		System.out.println("\033[H\033[2J"); // Limpiar terminal??????
		// Recibir, acortado
		System.out.print("Da un número:   ");
		float num = new Scanner(System.in).nextFloat();
		
		// presentar y eso
		System.out.printf("Resta no se que: %.2f",num-=35);
	}
}