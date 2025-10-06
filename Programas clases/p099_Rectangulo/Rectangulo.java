package p099_Rectangulo;

public class Rectangulo {
    private float largo;
    private float ancho;

    public Rectangulo() {}

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    //getters
    public float getLargo() {   
        return largo;
    }
    public float getAncho() {
        return ancho;
    }

    //setters
    public void setLargo(float largo) {
        this.largo = largo;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea() {
        return largo * ancho;
    }
    public float getPerimetro() {
        return 2 * (largo + ancho);
    }
    @Override
    public String toString() {
        return "Rectangulo\t[ Largo = \t" + largo + "\t, Ancho = \t" + ancho + "\t]";
    }
}
