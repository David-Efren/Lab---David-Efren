// Programa 065 - Sistema de Papeleria
// David Efren Terrones Buchard

import java.util.Scanner;

public class p065_SistemaPapeleria {
    public static void main(String[] args) {
        // Declarar
        int n=0,s=0, op;
        int c=3, cn=0, o=4, on=0, d=6, dn=0, cant=0, v=0;
        char resp;
        Scanner obj = new Scanner(System.in);
        // Loop del programa
        do {
            // Menu
            System.out.println("\n\n------- TIPOS DE COPIAS -------");
            System.out.println("\tCarta    [ 1 ]");
            System.out.println("\tOficio   [ 2 ]");
            System.out.println("\tDoble    [ 3 ]");
            System.out.println("\tSalir    [ 4 ]");
            System.out.println("----------------------------------");
            // Entrada
            System.out.print("\tElige\t:\t"); op = obj.nextInt();
            // Accion - procesos
            switch (op) {
                case 1:
                    System.out.print("\tINGRESA LA CANTIDAD\t:\t"); cant = obj.nextInt();
                    s = cant * c;
                    cn += s;
                    n += s;
                    v += cant;
                    break;
                case 2:
                    System.out.print("\tINGRESA LA CANTIDAD\t:\t"); cant = obj.nextInt();
                    s = cant * o;
                    on += s;
                    n += s;
                    v += cant;
                    break;
                case 3:
                    System.out.print("\tINGRESA LA CANTIDAD\t:\t"); cant = obj.nextInt();
                    s = cant * d;
                    dn += s;
                    n += s;
                    v += cant;
                    break;
                default:
                    System.out.println("\nNo.");
                    break;
            }
            // Hay dos opciones de salidas
            System.out.print("\n\n  Deseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while (op != 4 && resp != 'N');
        // Salida
        System.out.println("\n------- RESUMEN DE VENTAS -------");
        System.out.printf("\nCarta  :\t%d\t-\t$\t%d", c, cn);
        System.out.println("\n----------------------------------");
        System.out.printf("\nOficio :\t%d\t-\t$\t%d", o, on);
        System.out.println("\n----------------------------------");
        System.out.printf("\nDoble  :\t%d\t-\t$\t%d", d, dn);
        System.out.println("\n----------------------------------");
        System.out.printf("\nTOTAL  :\t%d\t-\t$\t%d", v, n);
        System.out.println("\n----------------------------------");
    }
}
