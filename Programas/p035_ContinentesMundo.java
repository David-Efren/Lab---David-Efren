import java.util.Scanner;

public class p035_ContinentesMundo {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n1;
		
		// Ingresar datos
		System.out.println("ELIGE UN CONTINENTE.");
		System.out.println("\n  [ 1 ] Asia");
		System.out.println("\n  [ 2 ] Africa");
		System.out.println("\n  [ 3 ] America del norte");
		System.out.println("\n  [ 4 ] America del sur");
		System.out.println("\n  [ 5 ] Antartida");
		System.out.println("\n  [ 6 ] Europa");
		System.out.println("\n  [ 7 ] Oceania");// Le faltó Oceanía / Australia 
		n1 = obj.nextInt();
		
		// proceso
		switch (n1) {
			case 1 : System.out.println("\n\nSELECCION : ASIA"); break;
			case 2 : System.out.println("\n\nSELECCION : AFRICA"); break;  
			case 3 : System.out.println("\n\nSELECCION : AMERICA DEL NORTE"); break; 
			case 4 : System.out.println("\n\nSELECCION : AMERICA DEL SUR"); break;
			case 5 : System.out.println("\n\nSELECCION : ANTARTIDA"); break;  
			case 6 : System.out.println("\n\nSELECCION : EUROPA"); break; 
			case 7 : System.out.println("\n\nSELECCION : OCEANIA"); break; 
			default:
				System.out.println("\n\n No"); 
		}
	}
}