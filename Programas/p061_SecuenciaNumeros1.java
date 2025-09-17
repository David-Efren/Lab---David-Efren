import java.util.Scanner;

public class p061_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int n,m;
        char resp;
        Scanner obj = new Scanner(System.in);

        System.out.println("IMPRIMIR PIRAMIDE DESEADA.");
        //Inicio del programa
        do {
            // Entrada
            System.out.print("\n\tIntroduce la altura de la piramide           : "); n = obj.nextInt();
            // Primer ciclo: Indica el cambio de renglon
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=i; j++) {
                    // Segundo ciclo: los caracteres
                    m=i;
                    System.out.print(m);
                }
                System.out.println();
            }
            System.out.print("\n\nDeseas continuar?\t(S/N)");resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
    }
}