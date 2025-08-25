import java.util.Scanner;

public class p014_CalculoTiempo {
	public static void main(String[] args) {
	    // Declarar
    	Scanner obj = new Scanner(System.in);
		int d,m,s,x;
		
		System.out.println("Convertir horas a dias/minutos/segundos.");
		// Leer
		System.out.print("\n\nIntroduce hora         	: "); x = obj.nextInt();
	    // Calcular
	    D = x % 24;
        m = x * 60;
        s = x * 3600;
	    // Mostrar
	    System.out.printf("\n\n%d Horas son iguales a:\n (%d / %d / %d) alt:",x,d,m,s,x/24);
	}
}