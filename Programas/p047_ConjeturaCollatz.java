import java.util.Scanner;

public class p047_ConjeturaCollatz {
    public static void main(String[] args) {
        int n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("CONJETURA DE COLLATZ\n");
            do {
            System.out.print("Introduce un número positivo  : "); n = obj.nextInt();
            } while (n < 0);
            do {
            System.out.printf("-> %d ", n);
            if (n % 2 == 0) // par
                n = n / 2;
            else            // impar
                n = n * 3 + 1;
            } while (n != 1);
            System.out.printf("= [ %d ] ", n);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
    }
}
