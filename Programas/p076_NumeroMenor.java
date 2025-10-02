import java.util.Scanner;

public class p076_NumeroMenor {
    public static void leer(int n, int[] x, Scanner obj) {
        for (int i=0; i<n; i++) {
            System.out.printf("Introduce el número %d :\t", i+1);
            x[i] = obj.nextInt();
        }
    }
    public static int Menor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Introduce el número de elementos: ");
        int n = obj.nextInt();
        int[] num = new int[n];
        leer(n, num, obj);
        int menor = Menor(num);
        System.out.println("El número menor es: " + menor);
    }

    
}
