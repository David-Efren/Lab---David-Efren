package p112_ControlVentas;

public class VentaContado extends Venta {
    private final float descuento;
    private final String regalo;

    public VentaContado(String articulo, float precio , float cantidad, float descuento, String regalo) {
        super(articulo, cantidad, precio);
        this.descuento = descuento;
        this.regalo = regalo;
    }
// Al heredar de venta es obligatorio implementar el método abstracto getTotal
    @Override
    public float getTotalVenta() {
        return total - (total * descuento / 100);
    }
    
    @Override
    public String toString() {
        return """
                VENTA AL CONTADO:
                %s
                \n\tDescuento : %.2f
                \n\tRegalo    : %s
                \n\tTotal     : %.2f
                """.formatted(super.toString(), descuento, regalo, getTotalVenta());
        }
    }
