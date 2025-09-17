import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        int n;
        float f,r;
        char resp;
        Scanner obj = new Scanner(System.in);

        System.out.println("SUMA DE LA SERIE 1/1 + 1/2 + ... + 1/n");
        //Inicio del programa
        do {
            // Entrada
            System.out.print("\n\tHasta que numero\t:\t"); n = obj.nextInt();
            r = 0;
            // Primer ciclo: indica la ecuacion
            for(int i=1; i<=n; i++) {
                f = 0;
                for(int j=1; j<=i; j++) {
                    // Segundo ciclo: copiar j
                    f = j;
                }
                System.out.printf("+  1 / %,.2f  ",f);
                r += (1 / f);
            }
            System.out.printf("=\t%,.2f\n",r);
            System.out.print("\n\nDeseas continuar?\t(S/N)");resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
    }
}