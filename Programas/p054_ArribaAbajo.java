import java.util.Scanner;

public class p054_ArribaAbajo {
    public static void main(String[] args) {
        int n, op;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("\n\n1 A N / N A 1");
            System.out.println("Numeros de 1 a n  [ 1 ]");
            System.out.println("Numeros de n a 1  [ 2 ]");
            System.out.println("Salir             [ 3 ]");
            System.out.print("\t Elige\t:\t"); op = obj.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("\n\n\tIngresa desde donde\t:\t");
                    n = obj.nextInt();
                    for (int i = 1; i <= n; i++)
                        System.out.printf("%d\t", i);
                    break;
                case 2:
                    System.out.print("\n\n\tIngresa desde donde\t:\t");
                    n = obj.nextInt();
                    for (int i = n; i >= 1; i--)
                        System.out.printf("%d\t", i);
                    break;
                case 3:
                    System.out.println("\nChao.");
                    break;
                default:
                    System.out.println("\nNo.");
                    break;
            }
        } while (op != 3);
    }
}
