package p112_ControlVentas;

public class VentaCredito extends Venta {
    private final float interes;
    private final int meses;

    public VentaCredito(String articulo, float precio , float cantidad, int meses, float interes) {
        super(articulo, cantidad, precio);
        this.interes = interes;
        this.meses = meses;
    }

    @Override
    public float getTotalVenta() {  
        return total + (total * (meses * interes / 100));
    }
    
    @Override
    public String toString() {
        return """
                VENTA A CRÉDITO:
                %s
                \n\tMeses   : %d
                \n\tInterés : %.2f
                \n\tTotal   : %.2f
                """.formatted(super.toString(), meses, interes, getTotalVenta());
    }
}
