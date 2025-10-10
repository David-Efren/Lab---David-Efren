package p101_TrabajoPersona;

public class Trabajo {
    private int id;
    private String rol;
    private double salario;

    public Trabajo() {} //sigo in saber pq esto

    public Trabajo(int id, String rol, double salario) {
        this.id = id;
        this.rol = rol;
        this.salario = salario;
    }
    // getters
    public int getId() {
        return id;
    }
    public String getRol() {
        return rol;
    }
    public double getSalario() {
        return salario;
    }
    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Trabajo\t[ ID = \t" + id + "\t, Rol = \t" + rol + "\t, Salario = \t" + salario + "\t]";
    }
}
