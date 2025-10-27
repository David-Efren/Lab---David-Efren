package p109_FormaV2;

public abstract class Figura {
    private String color;
    private boolean relleno;

    public Figura() {}

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    abstract double getArea();

    abstract double getPerimetro();

    @Override
    public String toString() {
        return """
                -----------------------------------------
                Figura :
                \tColor  :\t%s
                \tRelleno:\t%s
                """.formatted(color, relleno);
    }
}
