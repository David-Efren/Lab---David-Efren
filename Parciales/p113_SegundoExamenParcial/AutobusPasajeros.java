package p113_SegundoExamenParcial;

public class AutobusPasajeros extends Vehiculo {
    public int rutas;
    public int pasajerosTransportados;

    public AutobusPasajeros(String marca, String modelo, int capacidad, double costoBase, int rutas, int pasajerosTransportados) {
        super(marca, modelo, capacidad, costoBase);
        this.rutas = rutas;
        this.pasajerosTransportados = pasajerosTransportados;
    }

    @Override
    double getBonoConductor() {
        return (costoBase * 0.15) + (rutas * 120) + (pasajerosTransportados * 0.1);
    }
    @Override
    public String toString() {
        return super.toString() + 
               "\n\tRutas                   :\t" + rutas + 
               "\n\tPasajeros Transportados :\t" + pasajerosTransportados +
               "\n\tBono Conductor          :\t$" + String.format("%.2f", getBonoConductor()) +
               "\n\tCosto Total             :\t$" + String.format("%.2f", (costoBase + getBonoConductor()));
    }
}
