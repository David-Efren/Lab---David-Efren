import java.util.Scanner;

public class p057_TablasMultiplicar {
    public static void main(String[] args) {
        int n,m;
        char resp;
        Scanner obj = new Scanner(System.in);

        System.out.println("IMPRIMIR TABLA DESEADA.");
        //Inicio del programa
        do {
            // Entrada
            System.out.print("\n\tHasta que numero hacerle tabla (1 - N) : "); n = obj.nextInt();
            System.out.print("\n\tHasta donde llega la tabla     (1 - N) : "); m = obj.nextInt();
            // Primer ciclo: Indica el inicio de la tabla
            for(int i=1; i<=n; i++) {
                System.out.printf("\n\n\t\tTabla del %d\n",i);
                for(int j=1; j<=m; j++) {
                    // Segundo ciclo: La tabla en si
                    System.out.printf("\n\t%d\tx\t%d\t=\t%d",i,j,i*j);

                }
            }
            System.out.print("\n\nDeseas continuar?\t(S/N)");resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
    }
}