package p095_empleado02;

// Principio de encapsulamiento
public class Empleado {
    private String Nombre;
    private int Edad;

    // Setters
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void setEdad(int edad) {
        this.Edad = edad;
    }

    // Getters
    public String getNombre() {
        return Nombre;
    }
    public int getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        return "Nombre :\t" + Nombre + "\nEdad   :\t" + Edad;
    }   
}
