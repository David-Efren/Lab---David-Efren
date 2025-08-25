import java.util.Scanner;

public class p007_OperadoresAsignacion {
	public static void main(String[] args) {
		System.out.println("\033[H\033[2J"); // Limpiar terminal??????
		// Recibir, acortado
		System.out.print("Da un número:   ");
		float num = new Scanner(System.in).nextFloat(); // Metodo acortado hace que no se pueda cerrar apropiadamente, porque se necesita cerrar el scanner en primer lugar???
		
		// presentar y eso
		System.out.printf("Numero original  : %.2f",num);
		System.out.printf("Incremento		: %.2f",++num);
		System.out.printf("Sumar 80  	    : %.2f",num+=80);
		System.out.printf("Restar 35        : %.2f",num-=35);
		System.out.printf("Multiplicar 15   : %.2f",num*=15);
		System.out.printf("Decrementar 1    : %.2f",--num);
		// Cerrar el scanner???
		new Scanner(System.in).close();
	}
}