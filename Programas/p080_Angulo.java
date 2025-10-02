import java.util.Scanner;

public class p080_Angulo {
    public static void angNombre(int ang) {
        if (ang < 90) {
            System.out.println("\n\nEl ángulo es AGUDO.");
        } else if (ang == 90) {
            System.out.println("\n\nEl ángulo es RECTO.");
        } else if (ang > 90 && ang < 180) {
            System.out.println("\n\nEl ángulo es OBTUSO.");
        } else if (ang == 180) {
            System.out.println("\n\nEl ángulo es LLANO.");
        } else if (ang > 180 && ang < 360) {
            System.out.println("\n\nEl ángulo es OBTUSO.");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ang;
        System.out.print("Introduce un ángulo en grados (0-360) :\t");
        ang = obj.nextInt();
        if (ang >= 0 && ang <= 360) {
            angNombre(ang);
        } else {
            System.out.println("No.");
        }
    }
}
