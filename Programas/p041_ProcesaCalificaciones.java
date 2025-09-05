import java.util.Scanner;

public class p041_ProcesaCalificaciones {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,i;
        double calif, suma = 0, promedio;

        System.out.println("PROCESA CALIFICACIONES PERO CON WHILE");
        System.out.print("\n  Cantidad de calificaciones  : "); n = obj.nextInt();
        i = 0;
        while (i < n) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calif = obj.nextDouble();
            suma += calif;
            i++;
        }
        promedio = suma / n;
        System.out.printf("\n\nEl promedio de las calificaciones es: %.2f", promedio);
    }
}
