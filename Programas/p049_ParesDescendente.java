import java.util.Scanner;

public class p049_ParesDescendente {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int n,c,s;
        float i=0f;
        char resp;
        // Ciclo del programa
        do {
            System.out.println("SERIE DE NUMEROS PARES HASTA 100\n");
            System.out.print("\nNúmero inicial\t:\t"); n = obj.nextInt();
	        if (n<100) {
	            s=0;c=100;n =  (n%2==0 ? n : ++n);
	            // Ciclo de impresion
	            while( n<=c ) {
	                System.out.printf("\t%d",n);
	                s = s + n; // lleva cuenta de la suma
	                n = n+2; // Siempre sera par
	                ++i;
	            }
	            System.out.printf("\nSe imprimieron %.2f números.",i);
            	System.out.printf("\nLa suma es \t%d\nEl promedio es\t:\t%,.2f",s,s/i);
	        } else if (n>100) {
	           s=0;c=100;n =  (n%2==0 ? n : ++n);
	            // Ciclo de impresion
	            while( n>=c ) {
	                System.out.printf("\t%d",n);
	                s = s + n; // lleva cuenta de la suma
	                n = n-2; // Siempre sera par 
	                ++i;
	            }
	            System.out.printf("\nSe imprimieron %.2f números.",i);
            	System.out.printf("\nLa suma es \t%d\nEl promedio es\t:\t%,.2f",s,s/i);
	        }
            System.out.print("\n\n  Deseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0)); // Siempre asigna a que sea mayuscula
        } while( resp != 'N' );
	}
}