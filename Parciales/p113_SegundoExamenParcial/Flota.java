package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Flota {
    public String nombre;
    public String ciudad;

    ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public double getTotalBono() {
        double totalBono = 0.0;
        for (Vehiculo v : vehiculos) {
            totalBono += v.getBonoConductor();
        }
        return totalBono;
    }

    public double getTotalCosto() {
        double totalCosto = 0.0;
        for (Vehiculo v : vehiculos) {
            totalCosto += (v.costoBase + v.getBonoConductor());
        }
        return totalCosto;
    }

    public int getNumCamiones() {
        int count = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof CamionCarga) {
                count++;
            }
        }
        return count;
    }

    public int getNumAutobuses() {
        int count = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof AutobusPasajeros) {
                count++;
            }
        }
        return count;
    }
    
    public void reporte() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString() + "\n");
        }
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "FLOTA :\n\tNombre                           :\t" + nombre + "\n\tCiudad                           :\t" + ciudad +
               "\n\tNúmero Total de Vehículos        :\t" + vehiculos.size() +
               "\n\tNúmero de Camiones de Carga      :\t" + getNumCamiones() +
               "\n\tNúmero de Autobuses de Pasajeros :\t" + getNumAutobuses() +
               "\n\tBono Total                       :\t$" + String.format("%.2f", getTotalBono()) +
               "\n\tCosto Total de la Flota          :\t$" + String.format("%.2f", getTotalCosto());
    }
}
