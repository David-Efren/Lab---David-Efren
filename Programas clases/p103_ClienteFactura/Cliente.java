package p103_ClienteFactura;

public class Cliente {
    private String nombre;
    private int id;
    private float descuento;

    public Cliente(String nombre, int id, float descuento) {
        this.nombre = nombre;
        this.id = id;
        this.descuento = descuento;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getDescuento() {
        return descuento;
    }
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    @Override
    public String toString() {
        return "Cliente\n[ Nombre =\t" + nombre + " ]\n[ ID =\t" + id + " ]\n[ Descuento =\t" + descuento + " ]";
    }
}
