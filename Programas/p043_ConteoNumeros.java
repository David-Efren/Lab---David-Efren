import java.util.Scanner;

public class p043_ConteoNumeros {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n,c,s,cp,cn,cc;
        c=s=cp=cn=cc=0;

        System.out.println("CONTADOR DE NUMEROS. INTRODUCE [ 999 ] PARA TERMINAR");
        do {
            System.out.print("\n\n  Dame un numero ? "); n = obj.nextInt();
            if( n != 999) {
                c++;
                s = s + n;
                if(n>0) cp++; // CONTADOR DE POSITIVOS
                else if(n<0) cn++; // CONTADOR DE NEGATIVOS
                else cc++; // CONTADOR DE CEROS 
            }
        } while(n!=999);
        System.out.println("\nConteo terminado!");
        System.out.println("\nResultados:");
        System.out.printf("\n  Introdujiste %d numeros",c);
        System.out.printf("\n  La suma de los numeros es : %d",s);
        System.out.printf("\n  Los positivos fueron      : %d", cp);
        System.out.printf("\n  Los negativos fueron      : %d", cn);
        System.out.printf("\n  Los ceros fueron          : %d", cc);
    }
}
