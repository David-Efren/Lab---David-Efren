package p109_FormaV2;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Circulo circulo1 = new Circulo("rojo", true, 5.0);
        Circulo circulo2 = new Circulo("azul", false, 10.0);
        Rectangulo rectangulo1 = new Rectangulo("morado", true, 4.0, 6.0);
        Rectangulo rectangulo2 = new Rectangulo("negro", false, 8.0, 12.0);

        java.util.List<Figura> figuras = new java.util.ArrayList<>();
        figuras.add(circulo1);
        figuras.add(circulo2);
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);

        for (Figura figura : figuras) {
            System.out.println(figura);
        }
    }
}
