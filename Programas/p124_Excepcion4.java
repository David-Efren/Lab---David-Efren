import java.util.InputMismatchException;
import java.util.Scanner;

public class p124_Excepcion4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa el numerador :\t"); int num = obj.nextInt();
            System.out.print("Ingresa el denominador :\t"); int den = obj.nextInt();
            int c = num / den;
            System.out.println("Resultado :\t" + c);
        } catch (InputMismatchException | ArithmeticException e) { // Atrapa dos errores especificos
            System.out.println("Error: " + e.getMessage()); // Muestra el mensaje del error
        } finally {
            obj.close();
            System.out.println("\nEl objeto Scanner ha sido cerrado.");
        }
    }
}
