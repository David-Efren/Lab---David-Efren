import java.util.InputMismatchException;
import java.util.Scanner;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Ingresa la cantidad de niños :\t");
            int ninos = obj.nextInt();
            System.out.print("Ingresa la cantidad de dulces :\t");
            int dulces = obj.nextInt();

            System.out.println("Cada niño recibirá " + (dulces / ninos) + " dulces.");
        } catch (InputMismatchException e) {
            System.out.println("Los campos solo pueden ser numeros enteros\n" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("No.\n" + e.getMessage());
        }
    }
}
