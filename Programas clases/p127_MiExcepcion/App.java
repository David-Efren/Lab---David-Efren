package p127_MiExcepcion;

public class App {
    public static int sumar(int a, int b) throws FueraDeRango { 
        if (a > 100 | b > 100) {
            throw new FueraDeRango("Los numeros deben ser menores a 100");
        } return a + b;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        try {
            System.out.println("La suma es :\t" + sumar(50, 200));
        } catch (FueraDeRango e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
