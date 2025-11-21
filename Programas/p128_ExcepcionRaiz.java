import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Introduce un numero: ");
            int numero = obj.nextInt();
            double raiz = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de " + numero + " es :\t" + raiz);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se pudo calcular la raiz cuadrada.\n" + e.getMessage());
        }
    }
}
