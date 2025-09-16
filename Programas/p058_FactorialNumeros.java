import java.util.Scanner;

public class p058_FactorialNumeros {
    public static void main(String[] args) {
        int n,f;
        char resp;
        Scanner obj = new Scanner(System.in);

        System.out.println("IMPRIMIR FACTORIAL DE X NUMEROS.");
        //Inicio del programa
        do {
            // Entrada
            System.out.print("\n\tIntroduce haste que numero calcular su factorial\t:\t"); n = obj.nextInt();
            // Primer ciclo: La ecuacion
            for(int i=1; i<=n; i++) {
                System.out.printf("\t\t%d\t!=\t",i);
                f=1;
                for(int j=1; j<=i; j++) {
                    // Segundo ciclo: El factorial
                    f *= j;
                }
                //resultado
                System.out.println(f);
            }
            System.out.print("\n\nDeseas continuar?\t(S/N)");resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
    }
}
