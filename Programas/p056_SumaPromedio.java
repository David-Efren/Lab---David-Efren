import java.util.Scanner;

public class p056_SumaPromedio {
    public static void main(String[] args) {
        int n;
        float cal, suma, prom;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush(); //ok voy a usar esto de una vez
            suma = prom = 0;
            System.out.println("SUMA Y PROMEDIO DE CALIFICACIONES\n");
            System.out.print("Ingresa la cantidad de calificaciones\t:\t");
            n = obj.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.printf("Ingresa la calificacion\t%d\t:\t", i);
                cal = obj.nextFloat();
                suma += cal;
            }
            prom = suma / n;
            System.out.printf("\n\n\tSuma\t:\t%.2f\n\tPromedio\t:\t%.2f", suma, prom);
            System.out.print("\n\nCONTINUAR\t(S/N)\t");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso Terminado ...");
    }
}
