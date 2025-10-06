package p100_Articulo;

public class Articulo {
    private String id;
    private String desc;
    private int cant;
    private double precioUnit;

    articulo() {}

    public Articulo(String id, String desc, int cant, double precioUnit) {
        this.id = id;
        this.desc = desc;
        this.cant = cant;
        this.precioUnit = precioUnit;
    }

    //getters
    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }  
    public int getCant() {
        return cant;
    }
    public double getPrecioUnit() {
        return precioUnit;
    }
    public double getTotal() {
        return cant * precioUnit;
    }
    //setters
     public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }
    @Override
    public String toString() {
        return "Articulo\t[ ID = \t" + id + "\t, Desc = \t" + desc + "\t, Cant = \t" + cant + "\t, Precio Unit = \t" + precioUnit + "\t]";
    }
}
