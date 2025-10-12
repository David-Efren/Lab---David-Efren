package p104_PuntoCirculo;

public class Punto {
    private double x;
    private double y;

    public Punto() {}

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getDistancia(Punto otro) {
        return Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
    }

    @Override
    public String toString() {
        return "p (" + x + ", " + y + ")";
    }
}
