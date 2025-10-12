package p106_Persona;

// Estudiante deriva de Persona
public class Estudiante extends Persona {
    private String carrera;
    private double cuota;

    public Estudiante() {}
    // Constructor que recibe todos los atributos
    public Estudiante(String nombre, String direccion, String carrera, double cuota) {
        // Super llama al constructor de la clase base (Persona)
        super(nombre, direccion);
        this.carrera = carrera;
        this.cuota = cuota;
    }
    // Constructor que recibe un objeto Persona
    public Estudiante(Persona persona, String carrera, double cuota) {
        // Llama al constructor de la clase base con los atributos del objeto Persona
        super(persona.getNombre(), persona.getDireccion());
        this.carrera = carrera;
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public double getCuota() {
        return cuota;
    }
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Estudiante\n" + super.toString() + "\n[ Carrera =\t" + carrera + " ]\n[ Cuota =\t" + cuota + "]";
    }
}