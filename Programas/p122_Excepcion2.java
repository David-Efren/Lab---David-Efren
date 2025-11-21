import java.util.Scanner;

public class p122_Excepcion2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa un numero :\t");
            int val = obj.nextInt();
            val = val + 5;
            System.out.println("\nEl nuevo valor es :\t" + val);
        } catch (Exception e) {
            System.out.println("Debes introducir un valor númerico.");
        } 
        
    }
}
