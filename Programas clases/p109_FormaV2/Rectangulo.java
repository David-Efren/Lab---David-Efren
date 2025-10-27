package p109_FormaV2;

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo() {}

    public Rectangulo(String color, boolean relleno, double largo, double ancho) {
        super(color, relleno);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    double getArea() {
        return largo * ancho;
    }

    @Override
    double getPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public String toString() {
        return """
                %s
                Rectangulo :
                \tLargo      :\t%s
                \tAncho      :\t%s
                \tArea       :\t%s
                \tPerimetro  :\t%s
                """.formatted(super.toString(), largo, ancho, getArea(), getPerimetro());
    }
}