import java.util.Scanner;

public class p053_NumerosNa1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,p;
        
        System.out.println("1 A N CON PASO DE P\n");
        System.out.print("\tIngresa desde donde\t:\t"); n = obj.nextInt();
        System.out.print("\tIngresa el paso\t:\t"); p = obj.nextInt();
        // Se declara i en el mismo for
        for(int i=n; i>=1; i-=p) {

            System.out.printf("%d\t",i);

        }
    }    
}
