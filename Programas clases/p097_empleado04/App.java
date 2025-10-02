package p097_empleado04;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        ArrayList<Empleado> empleados = new ArrayList<>();

        Empleado emp1 = new Empleado("Juan Perez", 45, 'H', true);

        empleados.add(emp1);
        empleados.add(new Empleado("Maria de Jesus", 25, 'M', false));
        empleados.add(new Empleado("Marta Sanchez", 28, 'M', true));
        empleados.add(new Empleado("Carlos Lopez", 32, 'H', false));
        empleados.add(new Empleado("Ana Torres", 30, 'M', true));

        System.out.println("\nListado de empleados :");
        for (Empleado emp : empleados) {
            System.out.println(emp + "\n");
        }

        System.out.println("Estadisticas :");
        int suma = 0, total_hombres = 0, total_mujeres = 0, total_casados = 0, total_solteros = 0;
        for (Empleado emp : empleados) {
            suma += emp.getEdad();
            if (emp.getSexo() == 'H') {
                total_hombres++;
            } else {
                total_mujeres++;
            }
            if (emp.isCasado()) {
                total_casados++;
            } else {
                total_solteros++;
            }
        }
        System.out.println("Total empleados :\t" + empleados.size());
        System.out.println("Edad promedio   :\t" + (suma / empleados.size()));
        System.out.println("Total hombres   :\t" + total_hombres);
        System.out.println("Total mujeres   :\t" + total_mujeres);
        System.out.println("Total casados   :\t" + total_casados);
        System.out.println("Total solteros  :\t" + total_solteros);
    }
}
