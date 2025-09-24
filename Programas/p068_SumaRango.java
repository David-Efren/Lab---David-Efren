import java.util.Scanner;

public class p068_SumaRango {
    // Funcion
    public static float SumaRango(float ini, float fin) {
        float s = 0;
        for (float i = ini; i <= fin; i++)
            s += i;
        return s;
    }
    // Principal
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float i, f, res;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("SUMA EN RANGO CON FUNCIÓN\n");

        do {
            System.out.print("\tIntroduce inicio :\t");
            i = obj.nextFloat();
            System.out.print("\tIntroduce fin :\t");
            f = obj.nextFloat();
        } while (i > f);
        res = SumaRango(i, f);
        System.out.printf("\n\nLa suma del rango es %.2f", res);
    }
}
