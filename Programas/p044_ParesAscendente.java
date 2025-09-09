import java.util.Scanner;

public class p044_ParesAscendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,c,s;
        char resp;
        // Ciclo del programa
        do {
            System.out.println("SERIE DE NUMEROS PARES\n");
            System.out.print("  Hasta que numero? "); n = obj.nextInt();
            s=0;c=2;
            // Ciclo de impresion
            while( c<=n ) {
                System.out.printf("%d ",c);
                s = s + c; // lleva cuenta de la suma
                c = c+2; // Siempre sera par
            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\n\n  Deseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0)); // Siempre asigna a que sea mayuscula
        } while( resp != 'N' );
    }
}
