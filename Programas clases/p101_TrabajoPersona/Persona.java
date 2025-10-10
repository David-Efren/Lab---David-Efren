package p101_TrabajoPersona;

public class Persona {
    private String nombre;
    private Trabajo trabajo;

    public Persona() {} // Esto es para poder crear un objeto vacio sin dar error!

    public Persona(String nombre, Trabajo trabajo) {
        this.nombre = nombre;
        this.trabajo = trabajo;
    }

    // getters
    public String getNombre() {
        return nombre;
    }
    public Trabajo getTrabajo() {
        return trabajo;
    }
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
    @Override
    public String toString() {
        return "Persona\t[ Nombre = \t" + nombre + "\t]\n" + trabajo.toString();
    }
}
