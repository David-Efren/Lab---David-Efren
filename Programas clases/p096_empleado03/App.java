package p096_empleado03;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Empleado emp1 = new Empleado("Juan Perez", 45);
        System.out.println(emp1);

        Empleado emp2 = new Empleado("Maria de Jesus", 25);
        System.out.println(emp2);

        Empleado emp3 = new Empleado("Marta Sanchez", 28);
        System.out.println(emp3);
    }
}

