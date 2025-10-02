package p096_empleado03;

public class Empleado {
    private String nombre;
    private int edad;

    // constructor vacio
    public Empleado() {}

    public Empleado(String nombre, int edad) {
        this.nombre = nombre; // This es para referirse a la variable de instancia
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // otros metodos

    @Override
    public String toString() {
        return "Nombre :\t" + nombre + "\nEdad   :\t" + edad;
    }
}
