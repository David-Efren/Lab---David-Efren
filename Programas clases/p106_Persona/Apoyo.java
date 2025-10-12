package p106_Persona;

public class Apoyo extends Persona {
    private String Escolaridad;
    private double Paga;

    public Apoyo(String nombre, String direccion, String escolaridad, double paga) {
        super(nombre, direccion);
        Escolaridad = escolaridad;
        Paga = paga;

    }

    public String getEscolaridad() {
        return Escolaridad;
    }
    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }
    public double getPaga() {
        return Paga;
    }
    public double setPaga(double paga) {
        return Paga = paga;
    }

    @Override
    public String toString() {
        return "Apoyo\n" + super.toString() + "\n[ Escolaridad =\t" + Escolaridad + " ]\n[ Paga =\t" + Paga + "]";
    }
}
