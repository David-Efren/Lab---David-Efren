package p105_PuntoTriangulo;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Punto getV1() { return v1; }
    public void setV1(Punto v1) { this.v1 = v1; }

    public Punto getV2() { return v2; }
    public void setV2(Punto v2) { this.v2 = v2; }

    public Punto getV3() { return v3; }
    public void setV3(Punto v3) { this.v3 = v3; }

    public double getPerimetro() {
        double lado1 = v1.getDistancia(v2);
        double lado2 = v2.getDistancia(v3);
        double lado3 = v3.getDistancia(v1);
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        double lado1 = Math.round(v1.getDistancia(v2) * 100.0) / 100.0;
        double lado2 = Math.round(v2.getDistancia(v3) * 100.0) / 100.0;
        double lado3 = Math.round(v3.getDistancia(v1) * 100.0) / 100.0;

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isoceles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }
}
