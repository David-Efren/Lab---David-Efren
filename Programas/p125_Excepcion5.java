import java.util.Scanner;

public class p125_Excepcion5 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        int a[] = {20, 40, 50, 69, 420};
        System.out.println("El numero de elementos del arregro es :\t" + a.length);
        for (int i : a) {
            System.out.println("Elemento :\t" + i);
        }

        try {
            System.out.print("\nIngresa el indice del elemento que deseas ver :\t");
            int ind = obj.nextInt();
            System.out.println("El elemento en el indice " + ind + " es :\t" + a[ind]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mal :c");
        } finally {
            obj.close();
        }
    }
}
