import java.util.Random;

public class p093_ParesImpares{
    // Llenar arreglos con valores aleatorios (1 - 20)
    public static void genRandom(int[] x, Random rnd) {
        for (int i=0; i<x.length; i++) {
            x[i] = rnd.nextInt(20) + 1; // random 1-20
        }
    }

    public static void mostrar(int[] x) {
        for (int i=0; i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    // Mostrar y contar pares
    public static void par(int[] x) {
        int count = 0;
        System.out.println("\nNúmeros pares en el arreglo:");
        for (int i=0; i<x.length; i++) {
            if (x[i] % 2 == 0) {
                System.out.print(x[i] + " ");
                count++;
            }
        }
        System.out.println("\nCantidad de números pares: " + count);
    }

	public static void impar(int[] x) {
        int count = 0;
        System.out.println("\nNúmeros impares en el arreglo:");
        for (int i=0; i<x.length; i++) {
            if (x[i] % 2 != 0) {
                System.out.print(x[i] + " ");
                count++;
            }
        }
        System.out.println("\nCantidad de números impares: " + count);
    }

    public static void main(String[] args) {
        int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];

        Random rnd = new Random();

        // Generate random values
        genRandom(a, rnd);
        genRandom(b, rnd);

        // Show results
        System.out.println("ARREGLO A:");
        mostrar(a);
        par(a);
		impar(a);

        System.out.println("\n\n\nARREGLO B:");
        mostrar(b);
        par(b);
        impar(b);
    }
}