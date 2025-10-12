package p103_ClienteFactura;

public class Factura {
    private int id;
    private float monto;
    private Cliente cliente;

    public Factura(int id, float monto, Cliente cliente) {
        this.id = id;
        this.monto = monto;
        this.cliente = cliente;
    }
    // getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "Factura\n[ ID =\t" + id + " ]\n[ Monto =\t" + monto + " ]\n" + cliente.toString();
    }
}
