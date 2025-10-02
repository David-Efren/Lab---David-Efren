package p097_empleado04;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo; // 'H' hombre, 'M' mujer
    private boolean Casado; // true casado, false soltero

    public Empleado() {}

    public Empleado(String nombre, int edad, char sexo, boolean casado) {
        Nombre = nombre; // This no es necesario?
        Edad = edad;
        Sexo = sexo;
        Casado = casado;
    }

    // getters
    public String getNombre() {
        return Nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public char getSexo() {
        return Sexo;
    }
    public boolean isCasado() {
        return Casado;
    }
    // setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public void setCasado(boolean casado) {
        Casado = casado;
    }
    @Override
    public String toString() {
        return "Nombre :\t" + Nombre + "\nEdad   :\t" + Edad + "\nSexo   :\t" + (Sexo == 'H' ? "Hombre" : "Mujer") + "\nCasado :\t" + (Casado ? "Si" : "No");
    }
}
