package p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {
// Final porque el coso me lo dijo y me molestan las alertas
    private final String nombre;
    private final String propietario;
    private final String domicilio;
    private final ArrayList<Cliente> Clientes;

    public Tienda(String nombre, String propietario, String domicilio) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.domicilio = domicilio;
        this.Clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.Clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public float getTotal() { // Calcula el total de ventas de cada Cliente en un total de la tienda
        float totalTienda = 0;
        for (Cliente cliente : Clientes) {
            totalTienda += cliente.getTotal();
        }
        return totalTienda;
    }

    public void reporte() { // Mostrar cada cliente y de cliente sus ventas
        System.out.println("\n".repeat(50));
        System.out.println("Reporte de Ventas de la tienda " + this.toString());
    }

    @Override
    public String toString() {
        return """
                TIENDA :
                \n\tNombre     : %s
                \n\tPropietario: %s
                \n\tDomicilio  : %s
                \n\tTotal Ventas: %.2f
                """.formatted(nombre, propietario, domicilio, getTotal());
    }
}