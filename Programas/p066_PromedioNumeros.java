import java.util.Scanner;

public class p066_PromedioNumeros {
    // Funcion, bloque separado del principal
    public static float promedio(float n1, float n2, float n3) {
        float suma;
        suma = n1 + n2 + n3;
        return suma/3;
    }
    // Bloque principal
    public static void main(String[] args) {
        float n1, n2, n3, prom;
        Scanner obj = new Scanner(System.in);
        
         System.out.println("PROMEDIO DE TRES NÚMEROS CON FUNCIÓN\n");

        System.out.print("\n\tIntroduce el número 1 :\t"); n1 = obj.nextFloat();
        System.out.print("\n\tIntroduce el número 2 :\t"); n2 = obj.nextFloat();
        System.out.print("\n\tIntroduce el número 3 :\t"); n3 = obj.nextFloat();

        // Llamada de la funcion
        prom = promedio(n1, n2, n3);
        System.out.printf("\n\nEl promedio es :\t%.2f", prom);
    }
}
