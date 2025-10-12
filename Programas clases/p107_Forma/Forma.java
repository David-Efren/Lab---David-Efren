package p107_Forma;

// Sirve como base para otras clases
public abstract class Forma { // Clase abstracta, no puede ser instanciada directamente
                              // No se pueden crear objetos de esta clase
    private String color;

    public Forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
                                      // polimorfismo
    public abstract double getArea(); // metodo abstracto
                                      // no tiene codigo, debe ser implementado en las subclases
}
