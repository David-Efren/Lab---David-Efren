import java.util.Scanner;

public class p027_AceptarEstudiante {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String nombre;
        int edad;
        float c1,c2;

        System.out.println("ACEPTAR ESTUDIANTE A BASE DE EDAD Y CALIFICACIONES");
        System.out.print("\n  Ingresa tu nombre : "); nombre = obj.nextLine();
        System.out.print("\n  Ingresa tu edad   : "); edad = obj.nextInt();

        if (edad >=18) {
            System.out.println("Mayoría de edad verificada.");
            System.out.print("\n  Ingresa tu calificación 1 : "); c1 = obj.nextFloat();
            System.out.print("\n  Ingresa tu calificación 2 : "); c2 = obj.nextFloat();
            if ((c1+c2)/2 >= 8) {
                System.out.printf("Bienvenido %s! Tienes %d y un promedio de %.2f\n. Estás aceptado!!!!! :D",nombre,edad,(c1+c2)/2);
            }
        } else {
            System.out.println("Menor de edad detectado. Mejor ve a hacer tu tarea.");
        }
    }
}
