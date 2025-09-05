import java.util.Scanner;

public class p042_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num,n,i;

        System.out.println("IMPRIMIR TABLA DESEADA.");
        System.out.print("\n  Numero al que hacer la tabla  : "); num = obj.nextInt();
        System.out.print("\n  Hasta donde llega la tabla    : "); n = obj.nextInt();
        i = 0;
        while (i < n) {
            i++;
            System.out.printf("\n  %d x %d = %d", num, i, num * i);
        }
    }
}
