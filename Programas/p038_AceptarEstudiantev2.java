import java.util.Scanner;

public class p038_AceptarEstudiantev2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String nombre;
        char sexo;
        float prom;
        int edad;

        System.out.println("SUNIVERSIDAD KITTY KAT SA - INGRESO\n");
        System.out.print("\n  Ingresa tu nombre        :  "); nombre = obj.nextLine();
        System.out.print("\n  Ingresa tu sexo   [F/M]  :  "); sexo = obj.next().charAt(0);
        System.out.print("\n  Ingresa tu edad          :  "); edad = obj.nextInt();
        System.out.print("\n  Ingresa tu promedio      :  "); prom = obj.nextFloat();

        // Proceso.

        if (prom >= 8 && prom <= 9.8 && sexo == 'F' && edad >= 25) {
            System.out.printf("\n\n  %s, Estás aceptada amiga !! ^-^\n", nombre);
        } else {
            System.out.printf("\n\n  %s, No eres aceptado :(\n", nombre);
        }
    }
}