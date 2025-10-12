package p107_Forma;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double getArea() {
        return (base * altura) / 2;
    }
    @Override
    public String toString() {
        return "Triangulo\n[ color =\t" + getColor() + "]\n[ base =\t" + base + "]\n[ altura =\t" + altura + "]\n[ area =\t" + getArea() + "]";
    }
}
