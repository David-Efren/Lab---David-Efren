import java.util.Scanner;

public class p092_MayorMenor {
    public static void leer(int n, int[] x, Scanner obj) {
        for (int i=0; i<n; i++) {
            System.out.printf("Introduce el número %d :\t", i+1);
            x[i] = obj.nextInt();
        }
    }

    public static void mostrar(int[] x) {
        for (int i=0; i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
    
    public static int menor(int[] x) {
        int m = x[0];
        for (int i=0; i<x.length; i++) {
            if (x[i] < m) m = x[i];
        }
        return m;
    }
    
    public static int mayor(int[] x) {
        int m = x[0];
        for (int i=0; i<x.length; i++) {
            if (x[i] > m) m = x[i];
        }
        return m;
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        int[] x;

        System.out.print("Introduce el tamaño de la serie de números :\t");
        n = obj.nextInt();

        x = new int[n]; // inicializar Arreglo
        leer(n, x, obj);
        
        System.out.println("\n\nArreglo : ");
        mostrar(x);
        
        System.out.println("\n\nEl mayor es :\t" + mayor(x));
        System.out.println("El menor es :\t" + menor(x));
        
        obj.close();
    }
}