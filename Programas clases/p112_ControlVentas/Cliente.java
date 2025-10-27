package p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
    private final String Nombre;
    private final String Domicilio;
    private final String Correo;
    private final ArrayList<Venta> Ventas; // el cliente podra tener varias cuentas

    public Cliente(String nombre, String domicilio, String correo) {
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
        Ventas = new ArrayList<>(); // reservo espacio en memoria para el arreglo de ventas
    }

    public void agregarVenta(Venta venta) { // agrega una venta al arreglo de ventas
        Ventas.add(venta);
    }

    public ArrayList<Venta> getVentas() { // regresa todo el arreglo de ventas
        return Ventas;
    }

    public double getTotal() { // calculamos el total de cada venta y lo sumamos a un total de ventas del cliente
        float totalVentasCliente = 0;
        for (Venta venta : Ventas) {
            totalVentasCliente += venta.getTotalVenta();
        }
        return totalVentasCliente;
    }

    @Override
    public String toString() {
        return """
                CLIENTE :
                \n\tNombre        : %s
                \n\tDomicilio     : %s
                \n\tCorreo        : %s
                \n\tTotal a pagar : %.2f
                """.formatted(Nombre, Domicilio, Correo, getTotal());
    }
}
