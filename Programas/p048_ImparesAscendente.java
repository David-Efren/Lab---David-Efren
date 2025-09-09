import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,c,s;
        float i=0f;
        char resp;
        // Ciclo del programa
        do {
            System.out.println("SERIE DE NUMEROS IMPARES\n");
            System.out.print("\n\tHasta que numero? "); n = obj.nextInt();
            s=0;
            c=1; 
            n=( n%2==0 ? --n : n); // ? y : son abreviaciones de if y else. 
            // Ciclo de impresion
            while( c<=n ) {
                System.out.printf("\t%d",c);
                s = s + c; // lleva cuenta de la suma
                c = c+2; // Siempre sera impar
                ++i;
            }
            System.out.printf("\nSe imprimieron %.2f números.",i);
            System.out.printf("\nLa suma es \t%d\nEl promedio es\t:\t%,.2f",s,s/i);
            System.out.print("\n\n\tDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0)); // Siempre asigna a que sea mayuscula
        } while( resp != 'N' );
    }
}