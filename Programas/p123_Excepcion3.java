import java.util.InputMismatchException; // maneja las excepciones de tipo de entrada
import java.util.Scanner;

public class p123_Excepcion3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa el numerador :\t"); int num = obj.nextInt();
            System.out.print("Ingresa el denominador :\t"); int den = obj.nextInt();
            int c = num / den;
            System.out.println("Resultado :\t" + c);
        } catch (InputMismatchException e) { // Atrapa un error especifico
            System.out.println("Debes introducir un valor númerico.");
        } catch (ArithmeticException e) { // Igual
            System.out.println("Error: División por cero no permitida.");
        } finally {
            obj.close();
            System.out.println("\nEl objeto Scanner ha sido cerrado.");
        }
    }
}
