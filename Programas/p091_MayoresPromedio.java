import java.util.Scanner;

public class p091_MayoresPromedio {

    public static void leer(int n, double[] x, Scanner obj) {
        for (int i=0; i<n; i++) {
            System.out.printf("Introduce la calificación %d :\t", i+1);
            x[i] = obj.nextDouble();
        }
    }

    public static void mostrar(double[] x) {
        for (int i=0; i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
    
    public static double promedio(double[] x) {
        double suma = 0;
        for (int i=0; i<x.length; i++) {
            suma += x[i];
        }
        System.out.println("\n\nLa suma de las calificaciones es :\t" + suma);
        return suma / x.length;
    } 

    public static void mayoresPromedio(double[] x, double prom) {
        int contador = 0;
        System.out.println("\n\nCalificaciones mayores al promedio:");
        for (int i=0; i<x.length; i++) {
            if (x[i] > prom) {
                System.out.print(x[i] + " ");
                contador++;
            }
        }
        System.out.println("\nCantidad de calificaciones mayores al promedio: " + contador);
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        double[] x;

        System.out.print("Introduce el número de calificaciones a promediar :\t");
        n = obj.nextInt();

        x = new double[n]; // inicializar Arreglo
        leer(n, x, obj);
        
        System.out.println("\n\nCalificaciones : ");
        mostrar(x);
        
        double prom = promedio(x);
        System.out.println("\n\nPromedio :\t" + prom);

        mayoresPromedio(x, prom);
    }
}