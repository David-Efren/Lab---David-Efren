package p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Circulo c1 = new Circulo("Rojo", 2.5);
        Circulo c2 = new Circulo("Morado", 1.5);
        Triangulo t1 = new Triangulo("Azul", 3, 4);
        Triangulo t2 = new Triangulo("Verde", 5, 2.5);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(c1);
        formas.add(c2);
        formas.add(t1);
        formas.add(t2);
        formas.add(new Circulo("Naranja", 4.2));

        System.out.println("Listado de las\t" + formas.size() + "\tformas :");
        for (Forma f : formas) {
            System.out.println(f);
            System.out.print("El area del");
            if (f instanceof Circulo) { // instanceof pregunta que tipo de forma es 
                System.out.print(" circulo es :\t");
                System.out.println(((Circulo) f).getArea());
            } else if (f instanceof Triangulo) {
                System.out.print(" triangulo es :\t");
                System.out.println(((Triangulo) f).getArea());
            }
            System.out.println("\n");
        }
    }
}
