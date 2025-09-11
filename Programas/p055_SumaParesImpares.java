import java.util.Scanner;

public class p055_SumaParesImpares {
    public static void main(String[] args) {
        int n,s=0, op;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("\n\nPAR / IMPAR");
            System.out.println("Impares ascendentes  [ 1 ]");
            System.out.println("Pares descendentes   [ 2 ]");
            System.out.println("Salir                [ 3 ]");
            System.out.print("\t Elige\t:\t"); op = obj.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("\n\nImpares ascendentes y su suma.");
                    System.out.print("\tIngresa hasta donde\t:\t"); n = obj.nextInt();
                    n = ( n%2==0 ? --n : n);
                    for(int i=1; i<=n; i+=2) {
                        System.out.printf("%d\t",i);
                        s += i;
                    }
                    System.out.printf("\nLa suma de impares es\t:\t%d", s);break;
                case 2:
                    System.out.println("\n\nImpares ascendentes y su suma.");
                    System.out.print("\tIngresa hasta donde\t:\t"); n = obj.nextInt();
                    n = ( n%2==0 ? n : --n);
                    for(int i=1; i<=n; i+=2) {
                        System.out.printf("%d\t",i);
                        s += i;
                    }
                    System.out.printf("\nLa suma de impares es\t:\t%d", s);break;
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
