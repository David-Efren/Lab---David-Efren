import java.util.Scanner;

public class p074_Factorial {
    // funcion
    public static double Factorial(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.err.println("CALCULAR EL FACTORIAL DE UN NÚMERO");
        System.out.print("\tIntroduce un número :\t"); int n = obj.nextInt();
        System.out.printf("\n\nEl factorial de %d es %.0f", n, Factorial(n));
    }
}