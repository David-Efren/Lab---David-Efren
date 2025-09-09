import java.util.Scanner;

public class p046_TablaConversion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ini, fin, c;
        float tc = 19.99f;
        char resp;
        do {
            System.out.println("TABLA : PESOS MEXICANOS A DOLÁR ESTADOUNIDENSE\n");
            do {
                System.out.print("\n  Inicio : "); ini = obj.nextInt();
                System.out.print("\n  Fin : "); fin = obj.nextInt();
            } while( fin < ini );
            c=ini;
            System.out.println("MXN\t\tUSD"); // \t es tabulador.
            while( c<=fin ) {
                System.out.printf("%d\t$\t%.2f\t$\n",c,c/tc);
                c++;
            }
            System.out.print("\n  Deseas continuar (S/N) ? ");resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N');
    }
}
