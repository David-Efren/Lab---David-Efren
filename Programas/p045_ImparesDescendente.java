import java.util.Scanner;

public class p045_ImparesDescendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,c,s;
        char resp;
        // Ciclo del programa
        do {
            System.out.println("SERIE DE NUMEROS IMPARES\n");
            System.out.print("  Hasta que numero? "); n = obj.nextInt();
            s=0; 
            // "Si el resto de n es 0, restar, sino dejar igual."
            c=( n%2==0 ? --n : n); // ? y : son abreviaciones de if y else. 
            // Ciclo de impresion
            while( c>0 ) {
                System.out.printf("%d ",c);
                s = s + c; // lleva cuenta de la suma
                c = c-2; // Siempre sera impar
            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\n\n  Deseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0)); // Siempre asigna a que sea mayuscula
        } while( resp != 'N' );
    }
}
