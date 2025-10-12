package p106_Persona;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Persona p1 = new Persona("Bruno Diaz", "Calle 123");
        // Como es derivado de Persona, puede usar el constructor de Persona
        Estudiante e1 = new Estudiante("Mario Mario", "Calle 456", "Ingeniería", 2000.0);
        Estudiante e2 = new Estudiante("Sans U.", "Calle 102", "Medicina", 3000.0);
        Apoyo a1 = new Apoyo("Susie Gaster", "Calle 789", "Preparatoria", 1500.0);
        Apoyo a2 = new Apoyo("John Persona", "Calle 101", "Psicología", 2500.0);

        System.out.println("\nImpresion de datos :\n");
        System.out.println(p1);
        System.out.println(e1);
        System.out.println(a1);
        System.out.println(a2);

        ArrayList<Persona> universidad = new ArrayList<>();
        universidad.add(p1);
        universidad.add(e1);
        universidad.add(e2);
        universidad.add(a1);
        universidad.add(a2);

        double total_cuotas = 0.0;

        for (Persona persona : universidad) {
            if (persona instanceof Estudiante) {
                Estudiante est = (Estudiante) persona;
                total_cuotas += est.getCuota();
            }
        }

        System.out.printf("\nTotal de cuotas de estudiantes :\t%.2f\n", total_cuotas);
    }
    
}
