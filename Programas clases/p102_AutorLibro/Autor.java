package p102_AutorLibro;

public class Autor {
    private String nombre;
    private String correo;
    private int edad;

    public Autor() {}
    public Autor(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Autor [ nombre =\t" + nombre + " ]\n[ Correo =\t" + correo + " ]\n[ Edad =\t" + edad + " ]";
    }
}
