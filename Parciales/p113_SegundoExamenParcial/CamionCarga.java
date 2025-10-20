package p113_SegundoExamenParcial;

public class CamionCarga extends Vehiculo {
    public int ejes;
    public double kilometraje;

    public CamionCarga(String marca, String modelo, double costoBase, double kilometraje, int ejes, double capacidad) {
        super(marca, modelo, (int)capacidad, costoBase);
        this.ejes = ejes;
        this.kilometraje = kilometraje;
    }

    @Override
    double getBonoConductor() {
        return (costoBase * 0.10) + (ejes * 50) + (kilometraje * 0.5);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tEjes :\t" + ejes + "\n\tKilometraje :\t" + kilometraje + " km" +
               "\n\tBono Conductor :\t$" + String.format("%.2f", getBonoConductor()) +
               "\n\tCosto Total :\t$" + String.format("%.2f", (costoBase + getBonoConductor()));
    }
}
