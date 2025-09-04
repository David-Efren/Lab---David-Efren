import java.util.Scanner;

public class p031_NumerosRomanos {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("NUMERO ENTRE 1 Y 10  :  ");
		int n = obj.nextInt();
		
		switch (n) {
			case 1 : System.out.println("\n\nI"); break;
			case 2 : System.out.println("\n\nII"); break;
			case 3 : System.out.println("\n\nIII"); break;
			case 4 : System.out.println("\n\nIV"); break;
			case 5 : System.out.println("\n\nV"); break;
			case 6 : System.out.println("\n\nVI"); break;
			case 7 : System.out.println("\n\nVII"); break; 
			case 8 : System.out.println("\n\nVIII"); break; 
			case 9 : System.out.println("\n\nIX"); break; 
			case 10 : System.out.println("\n\nX"); break; 
			default:
				System.out.println("\n\n No");
		}
	}
}