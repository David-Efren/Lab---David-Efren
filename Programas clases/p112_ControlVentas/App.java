package p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        // Venta miVenta = new Venta(); // no se puede instanciar por que es una clase abstracta

        // Se crea la tienda
        Tienda miTienda = new Tienda("Don Lupe", "Guadalupe Ortiz", "Calle Fronter 134");

        // Se agregan clientes a la tienda
        miTienda.agregarCliente(new Cliente("Felipe Calderon", "Lomas Altas 123", "calde@msn.com"));
        miTienda.agregarCliente(new Cliente("Enrique Pena", "5 de Mayo 321", "quiqope@gmail.com"));
        miTienda.agregarCliente(new Cliente("Andres Lopez", "La chingada 156", "lopezillo@yahoo.com.com"));
        miTienda.agregarCliente(new Cliente("Xochitl Gelatinas", "Danone 357", "xochitl@hotmail.com"));

        // Primer reporte
        miTienda.reporte();

        // Agregar Ventas a los Clientes
        // Agregamos ventas al Cliente 1 - Felipe Calderon
        miTienda.getClientes().get(0).agregarVenta(new VentaContado("Martillo", 10, 80.5f, 10, "Sacabrocados"));
        miTienda.getClientes().get(0).agregarVenta(new VentaCredito("Pala", 2, 1176.55f, 3, 10));

        // Agregamos ventas al Cliente 2 - Enrique Pena
        miTienda.getClientes().get(1).agregarVenta(new VentaCredito("Clavo", 2.5f, 160.34f, 2, 20));
        miTienda.getClientes().get(1).agregarVenta(new VentaCredito("Cinta de Aislar", 5, 71.34f, 6, 20));
        miTienda.getClientes().get(1).agregarVenta(new VentaContado("Pinzas", 10, 656.33f, 20, "Taladro"));

        // Agregamos ventas al Cliente 3 - Andres Lopez
        miTienda.getClientes().get(2).agregarVenta(new VentaContado("Thinner", 50, 65.80f, 10, "Aerosol"));

        // Segundo reporte
        miTienda.reporte();
    }
}

