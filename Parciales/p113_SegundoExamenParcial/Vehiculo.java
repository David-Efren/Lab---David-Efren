package p113_SegundoExamenParcial;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected double costoBase;
    protected double costoTotal;

    public Vehiculo(String marca, String modelo, int capacidad, double costoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.costoBase = costoBase;
        this.costoTotal = 0.0;
    }

    abstract double getBonoConductor();

    @Override
    public String toString() {
        return "VEHICULO :\n\tMarca       :\t" + marca + 
               "\n\tModelo     :\t" + modelo + 
               "\n\tCapacidad  :\t" + capacidad +
               "\n\tCosto Base :\t$" + String.format("%.2f", costoBase);
    }
}
