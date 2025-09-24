import java.util.Scanner;

public class p073_SumaParesImpares {
    // funcion
    public static int SumaParImpar(int ini, int fin, char letra) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (letra == 'P' && i % 2 == 0) {
                System.out.printf("%d ", i);
                suma += i;
            } else if (letra == 'I' && i % 2 != 0) {
                System.out.printf("%d ", i);
                suma += i;
            } 
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ini, fin, suma;
        char poi;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("CONTAR PARES O IMPARES Y SUMARLOS");
        System.out.print("\tIntroduce valor inicial :\t");ini = obj.nextInt();
        System.out.print("\tIntroduce valor final :\t");fin = obj.nextInt();
        System.out.print("\nIntroduce sucesion preferida.\n\t[P]ares\t[I]Impares\n\tOpción :\t");
        poi = Character.toUpperCase(obj.next().charAt(0));
        suma = poi == 'P' ? SumaParImpar(ini, fin, 'P') : SumaParImpar(ini, fin, 'I');
        System.out.printf("\nLa suma es : %d", suma);
    }
}