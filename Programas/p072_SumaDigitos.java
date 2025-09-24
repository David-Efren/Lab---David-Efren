import java.util.Scanner;

public class p072_SumaDigitos {
    // funcion, separa y suma los digitos entre si
    public static int SumaDigitos(int n) {
        int suma = 0, digito;
        while (n != 0) {
            digito = n % 10;
            n = n / 10;
            suma += digito;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numero;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Introduce un número :\t");
        numero = obj.nextInt();
        System.out.printf("\nLa suma de los digitos es : %d", SumaDigitos(numero));
    }
}