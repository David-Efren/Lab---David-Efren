package p112_ControlVentas;

public abstract class Venta {
    private final String articulo;
    private final float cantidad;
    private final float precio;
    protected float total; //protected hace que solo las subclases puedan acceder a este atributo
    
    public Venta(String articulo, float cantidad, float precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public abstract float getTotalVenta();

    @Override
    public String toString() {
        return """
                \n\tArtículo : %s
                \n\tCantidad : %.2f
                \n\tPrecio   : %.2f
                """.formatted(articulo, cantidad, precio);
    }
}
