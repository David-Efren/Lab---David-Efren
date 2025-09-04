import java.util.Scanner;

public class p030_DiaSemana {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Dame un número ( 1 - 7 )  :");
		int dia = obj.nextInt();
		
		switch (dia) {
			case 1 : System.out.println("\n\nLunes"); break;
			case 2 : System.out.println("\n\nMartes"); break;
			case 3 : System.out.println("\n\nMiercoles"); break;
			case 4 : System.out.println("\n\nJueves"); break;
			case 5 : System.out.println("\n\nViernes"); break;
			case 6 : System.out.println("\n\nSabado"); break;
			case 7 : System.out.println("\n\nDomingo"); break; 
			default:
				System.out.println("\n\n No");
				break;   
		}
	}
}