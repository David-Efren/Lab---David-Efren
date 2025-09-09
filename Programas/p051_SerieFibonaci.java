import java.util.Scanner;

public class p051_SerieFibonaci {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int n,n1,n2,f;int i = 0;
        char resp;
        // Ciclo del programa
        do {
            System.out.println("SERIE DE FIBONACCI");
            System.out.print("\nHasta que digito\t?\t"); n = obj.nextInt();
            n1=0;n2=1;f=0;
	        // Ciclo de impresion
	        while( i <= n ) {
		        System.out.printf("\t%d",f);
		        f = n1; // lleva cuenta de la suma
		        n1 = n2;
		        n2 += f;
		        ++i;
	        }
            System.out.print("\n\n  Deseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0)); // Siempre asigna a que sea mayuscula
        } while( resp != 'N' );
	}
}