package p094_empleado01;

public class App {
    public static void main(String[] args) {
        // instanciar clase y reservar espacio en memoria para un objeto
        Empleado emp1 = new Empleado();
        emp1.Nombre = "Juan Perez";
        emp1.Edad = 28;
        System.out.println(emp1.toString());

        // Instanciar la clase, luego en otra linea reservar memoria para objeto
        Empleado emp2;
        emp2 = new Empleado();
        emp2.Nombre = "Maria de Jesus";
        emp2.Edad = 25;
        System.out.println(emp2.toString());

        // Accediendo a propiedades individuales
        Empleado emp3 = new Empleado();
        emp3.Nombre = "Carlos Castañeda";
        emp3.Edad = 35;
        System.out.println("Nombre :\t" + emp3.Nombre);
        System.out.println("Edad   :\t" + emp3.Edad);
        System.out.println(emp3); // Invoca de forma automatica el metodo toString()
    }
}