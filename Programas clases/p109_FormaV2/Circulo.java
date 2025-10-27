package p109_FormaV2;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {}

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return """
                %s
                Circulo :
                \tRadio  :\t%s
                \tArea  :\t%s
                \tPerimetro    :\t%s
                """.formatted(super.toString(), radio, getArea(), getPerimetro());
    }
}
