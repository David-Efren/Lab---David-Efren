import java.util.Scanner;

public class p069_TablaMultiplicar {
    // Funcion
    public static void tabla(int num, int n) {
        int i = 0;
        while (i < n) {
            i++;
            System.out.printf("\n\t%d\tx\t%d\t=\t%d", num, i, num * i);
        }
    }
    // principal
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num,n;

        System.out.println("IMPRIMIR TABLA DESEADA.");
        System.out.print("\n\tNumero al que hacer la tabla  :\t"); num = obj.nextInt();
        System.out.print("\n\tHasta donde llega la tabla    :\t"); n = obj.nextInt();
        
        tabla(num, n);
    }
}
