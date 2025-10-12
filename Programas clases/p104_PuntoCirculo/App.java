package p104_PuntoCirculo;
public class App {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(new Punto(5, 8), 6);
        Circulo circulo2 = new Circulo(new Punto(30,46),2);

        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println("Circulo 1 Area           :\t" + circulo1.getArea());
        System.out.println("Circulo 1 Circunferencia :\t" + circulo1.getCircunferencia());
        System.out.println("Circulo 1 Centro         :\t" + circulo1.getCentro());
        System.out.println("Distancia a Circulo 2    :\t" +
        circulo1.getCentro().getDistancia(circulo2.getCentro()));
    }
}