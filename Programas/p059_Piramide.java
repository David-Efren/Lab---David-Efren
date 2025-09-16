import java.util.Scanner;

public class p059_Piramide {
    public static void main(String[] args) {
        int n;
        char resp,m;
        Scanner obj = new Scanner(System.in);

        System.out.println("IMPRIMIR PIRAMIDE DESEADA.");
        //Inicio del programa
        do {
            // Entrada
            System.out.print("\n\tIntroduce la altura de la piramide           : "); n = obj.nextInt();
            System.out.print("\n\tIntroduce de que character hacer la piramide : "); m = obj.next().charAt(0);
            // Primer ciclo: Indica el cambio de renglon
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=i; j++) {
                    // Segundo ciclo: los caracteres
                    System.out.print(m);
                }
                System.out.println();
            }
            System.out.print("\n\nDeseas continuar?\t(S/N)");resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
    }
}
