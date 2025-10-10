package p101_TrabajoPersona;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona(); // Primero vacio
        Trabajo t1 = new Trabajo();

        // ahora para ingresar datos
        t1.setId(1);
        t1.setRol("Chef");
        t1.setSalario(69.420);

        p1.setNombre("Mimi");
        p1.setTrabajo(t1);

        // Metodo 2
        Persona p2 = new Persona("Webi Wabo", new Trabajo(2, "Ingeniero de reactores nucleares.", 3.009));
        Persona p3 = new Persona("Juan", new Trabajo(3, "Doctor", 1225));

        System.out.println("\033[H\033[2J");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\nAhora con array list.\n");

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        // Si, tambien se puede asi
        personas.add(new Persona("Marcy Ana", new Trabajo(4,"Astrofisica", 1500)));

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
