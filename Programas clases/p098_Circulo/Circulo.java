package p098_Circulo;

public class Circulo {
    private double radio;
    private double pi = 3.1416;
    private double area;
    private double circunferencia;

    public Circulo() {}

    public Circulo(double radio) {
        this.radio = radio;
    }

    //getters
    public double getRadio() {
        return radio;
    }
    public double getArea() {
        return area = pi * radio * radio;
    }
    public double getCircunferencia() {
        return circunferencia = 2 * pi * radio;
    }
    //setters
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Circulo\t[ Radio = \t" + radio + "\t]";
    }
}