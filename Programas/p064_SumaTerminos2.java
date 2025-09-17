import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        int n,f,r;
        char resp;
        Scanner obj = new Scanner(System.in);

        System.out.println("SUMA DE LA SERIE 1 +  11  +  111  +  ...");
        //Inicio del programa
        do {
            // Entrada
            System.out.print("\n\tHasta que numero\t:\t"); n = obj.nextInt();
            r = 0;
            // Primer ciclo: indica el ciclo
            for(int i=1; i<=n; i++) {
                f = 0;
                for(int j=1; j<=i; j++) {
                    // Segundo ciclo: ecuación de la serie
                    f = f * 10 + 1;
                }
                System.out.printf("+  %d  ",f);
                r += f;
            }
            System.out.printf("\t=\t%d",r);
            System.out.print("\n\nDeseas continuar?\t(S/N)");resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
    }
}