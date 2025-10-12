package p107_Forma;

public class Circulo extends Forma {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override // Implementamos o sobreescribimos sobre el metodo getArea de la clase base
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Circulo\n[ color =\t" + getColor() + "]\n[ radio =\t" + radio + "]\n[ area =\t" + getArea() + "]";
    }
}
