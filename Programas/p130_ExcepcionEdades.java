import java.util.InputMismatchException;
import java.util.Scanner;
public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        int n = 0;

        while(true) {
            try {
                System.out.print("Ingresa la cantidad de personas :\t");
                n = obj.nextInt();
                break; // salir del ciclo si la entrada es valida
            } catch (InputMismatchException e) {
                System.out.println("El valor debe ser un numero entero.\n" + e.getMessage());
                obj.next(); // limpiar el buffer
            }
        }
        int edad[] = new int[n];
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Ingresa la edad de la persona " + (i + 1) + " :\t");
                edad[i] = obj.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("El valor debe ser un numero entero.\n" + e.getMessage());
                i --;
                obj.next(); // limpiar el buffer
            }
        }

        System.out.println("\nLas edades ingresadas son :");
        for (int i : edad) {
            System.out.println(i);
        }
    }
}
