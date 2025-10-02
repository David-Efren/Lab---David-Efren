package p095_empleado02;

// Principio de encapsulamiento

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Empleado emp1 = new Empleado();
        emp1.setNombre("Juan Perez");
        emp1.setEdad(28);
        System.out.println(emp1.toString());

        Empleado emp2;
        emp2 = new Empleado();
        emp2.setNombre("Maria de Jesus");
        emp2.setEdad(25);
        System.out.println(emp2.toString());
        
    }
}
