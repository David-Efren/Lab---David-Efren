import java.util.Scanner;
public class p085_NombresEdades {
    public static void main(String[] args) {
        int n, s=0, p=0;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Introduce la cantidad de nombres a procesar :\t"); n = obj.nextInt();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        // Entrada de datos
        for(int i=0; i < nombres.length ; i++) {
            obj.nextLine();
            System.out.printf("Introduce el nombre numero %d :\t", i+1); nombres[i] = obj.nextLine();
            System.out.printf("Introduce su edad             :\t", i+1); edades[i] = obj.nextInt();
        }
        // Escupir los datos
        System.out.println("\n\nLos nombres capturados son :");
        System.out.printf("\tNombre\tEdad\n");
        for(int i=0; i<nombres.length; i++) {
            System.out.printf("\t%s\t%d\n", nombres[i], edades[i]);
            s += edades[i];
        }
        p = s / edades.length;
        System.out.printf("\nEl promedio de edades es %d", p);
    }
}