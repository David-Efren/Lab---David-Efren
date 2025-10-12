package p103_ClienteFactura;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        ArrayList<Factura> facturas = new ArrayList<>();
        
        facturas.add(new Factura(1, 1500.75f, new Cliente("Juan Perez", 101, 0.1f)));
        facturas.add(new Factura(2, 2500.00f, new Cliente("Maria Gomez", 102, 0.15f)));
        facturas.add(new Factura(3, 3200.50f, new Cliente("John Persona", 103, 0.2f)));
        facturas.add(new Factura(4, 4500.25f, new Cliente("Jane Persona", 104, 0.05f)));

        System.out.println("Listado de Facturas y Clientes :\n");
        for (Factura factura : facturas) {
            System.out.println(factura);
            System.out.println();
        }
        float total = 0;
        System.out.println("Despliege de dato individuales :\n");
        for (Factura factura : facturas) {
            System.out.printf("Factura ID :\t%d\nMonto      :\t%.2f\nCliente    :\t%s\nDescuento  :\t%.2f%%\n",
                    factura.getId(),
                    factura.getMonto(),
                    factura.getCliente().getNombre(),
                    factura.getCliente().getDescuento() * 100); // Aparentemente se puede formatear de esta manera.
            total += factura.getMonto() * (1 - factura.getCliente().getDescuento());
        }
        System.out.printf("\nTotal Facturado (con descuento) :\t%.2f\n", total);
    }
}
